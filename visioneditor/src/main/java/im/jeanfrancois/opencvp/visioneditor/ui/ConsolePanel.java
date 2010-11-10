package im.jeanfrancois.opencvp.visioneditor.ui;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import javax.swing.*;
import java.awt.*;

/**
 * Console panel.
 *
 * @author jfim
 */
@Singleton
public class ConsolePanel extends JPanel implements ConsoleOutputer {
	JTextArea textArea = new JTextArea();

	@Inject
	public ConsolePanel() {
		setLayout(new BorderLayout());
		JScrollPane scrollPane = new JScrollPane(textArea);
		scrollPane.setBorder(BorderFactory.createEmptyBorder());
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		add(scrollPane, BorderLayout.CENTER);
	}

	@Override
	public void outputLine(final String line) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				textArea.setText(textArea.getText() + line + "\n");
			}
		});
	}
}
