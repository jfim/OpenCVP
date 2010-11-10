package im.jeanfrancois.openvp.common.ui;

import org.apache.commons.collections15.buffer.BoundedFifoBuffer;
import org.apache.commons.collections15.buffer.CircularFifoBuffer;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.GeneralPath;
import java.awt.geom.Point2D;


/**
 * Sparklines are small, high data density information graphics as
 * described by Edwards Tufte in the book Beautiful Evidence.
 *
 * @author jfim
 */
public class JSparkline extends JComponent {
	private static final float SPARK_SIZE = 5.0f;
	private static final int ELEMENT_WIDTH = 4;
	private static final int COMPONENT_HEIGHT = 16;
	private BoundedFifoBuffer<Integer> data;
	private boolean dirty = true;

	/**
	 * Constructs a sparkline with a maximum capacity of maxCapacity.
	 *
	 * @param maxCapacity The maximum capacity
	 */
	public JSparkline(int maxCapacity) {
		data = new CircularFifoBuffer<Integer>(maxCapacity);
	}

	/**
	 * Adds a data element to the sparkline.
	 *
	 * @param value The value to add to the sparkline.
	 */
	public synchronized void addDataElement(int value) {
		data.add(value);

		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				repaint();
			}
		});
	}

	@Override
	public Dimension getMaximumSize() {
		return getPreferredSize();
	}

	@Override
	public Dimension getMinimumSize() {
		return getPreferredSize();
	}

	@Override
	public Dimension getPreferredSize() {
		return new Dimension((data.maxSize() * ELEMENT_WIDTH) +
				(int) (SPARK_SIZE / 2) + 1, COMPONENT_HEIGHT);
	}

	@Override
	public synchronized void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);

		// Find the maximum, minimum and delta
		int minValue = Integer.MAX_VALUE;
		int maxValue = Integer.MIN_VALUE;

		for (Integer dataElement : data) {
			// Unbox element so we don't do the unboxing twice
			int value = dataElement;

			if (maxValue < value) {
				maxValue = value;
			}

			if (value < minValue) {
				minValue = value;
			}
		}

		float delta = maxValue - minValue;
		if(delta == 0.0f) {
			delta = 1.0f;
		}

		// Create a path that corresponds to the sparkline data
		GeneralPath path = new GeneralPath();
		int x = 0;
		boolean firstElement = true;

		for (Integer dataElement : data) {
			int value = dataElement;

			// Calculate the actual position of the sparkline
			final float usableHeight = COMPONENT_HEIGHT - (SPARK_SIZE / 2) - 2;
			float y = COMPONENT_HEIGHT -
					((value - minValue) / delta * usableHeight) -
					(SPARK_SIZE / 2);

			if (firstElement) {
				path.moveTo(x, y);
				firstElement = false;
			} else {
				path.lineTo(x, y);
			}

			x += ELEMENT_WIDTH;
		}

		// Draw the sparkline
		g2d.setColor(Color.BLACK);
		g2d.setStroke(new BasicStroke(1.5f));
		g2d.draw(path);

		// Draw the spark
		g2d.setColor(Color.RED);

		Point2D sparkPoint = path.getCurrentPoint();
		g2d.fillOval((int) (sparkPoint.getX() - (SPARK_SIZE / 2)),
				(int) (sparkPoint.getY() - (SPARK_SIZE / 2)),
				(int) SPARK_SIZE, (int) SPARK_SIZE);
	}
}
