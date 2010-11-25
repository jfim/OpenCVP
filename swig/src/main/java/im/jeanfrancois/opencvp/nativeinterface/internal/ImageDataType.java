/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package im.jeanfrancois.opencvp.nativeinterface.internal;

public final class ImageDataType {
  public final static ImageDataType IMAGE_DATA_TYPE_8UC1 = new ImageDataType("IMAGE_DATA_TYPE_8UC1", opencvpJNI.IMAGE_DATA_TYPE_8UC1_get());
  public final static ImageDataType IMAGE_DATA_TYPE_8UC2 = new ImageDataType("IMAGE_DATA_TYPE_8UC2", opencvpJNI.IMAGE_DATA_TYPE_8UC2_get());
  public final static ImageDataType IMAGE_DATA_TYPE_8UC3 = new ImageDataType("IMAGE_DATA_TYPE_8UC3", opencvpJNI.IMAGE_DATA_TYPE_8UC3_get());
  public final static ImageDataType IMAGE_DATA_TYPE_8UC4 = new ImageDataType("IMAGE_DATA_TYPE_8UC4", opencvpJNI.IMAGE_DATA_TYPE_8UC4_get());
  public final static ImageDataType IMAGE_DATA_TYPE_8SC1 = new ImageDataType("IMAGE_DATA_TYPE_8SC1", opencvpJNI.IMAGE_DATA_TYPE_8SC1_get());
  public final static ImageDataType IMAGE_DATA_TYPE_8SC2 = new ImageDataType("IMAGE_DATA_TYPE_8SC2", opencvpJNI.IMAGE_DATA_TYPE_8SC2_get());
  public final static ImageDataType IMAGE_DATA_TYPE_8SC3 = new ImageDataType("IMAGE_DATA_TYPE_8SC3", opencvpJNI.IMAGE_DATA_TYPE_8SC3_get());
  public final static ImageDataType IMAGE_DATA_TYPE_8SC4 = new ImageDataType("IMAGE_DATA_TYPE_8SC4", opencvpJNI.IMAGE_DATA_TYPE_8SC4_get());
  public final static ImageDataType IMAGE_DATA_TYPE_16UC1 = new ImageDataType("IMAGE_DATA_TYPE_16UC1", opencvpJNI.IMAGE_DATA_TYPE_16UC1_get());
  public final static ImageDataType IMAGE_DATA_TYPE_16UC2 = new ImageDataType("IMAGE_DATA_TYPE_16UC2", opencvpJNI.IMAGE_DATA_TYPE_16UC2_get());
  public final static ImageDataType IMAGE_DATA_TYPE_16UC3 = new ImageDataType("IMAGE_DATA_TYPE_16UC3", opencvpJNI.IMAGE_DATA_TYPE_16UC3_get());
  public final static ImageDataType IMAGE_DATA_TYPE_16UC4 = new ImageDataType("IMAGE_DATA_TYPE_16UC4", opencvpJNI.IMAGE_DATA_TYPE_16UC4_get());
  public final static ImageDataType IMAGE_DATA_TYPE_16SC1 = new ImageDataType("IMAGE_DATA_TYPE_16SC1", opencvpJNI.IMAGE_DATA_TYPE_16SC1_get());
  public final static ImageDataType IMAGE_DATA_TYPE_16SC2 = new ImageDataType("IMAGE_DATA_TYPE_16SC2", opencvpJNI.IMAGE_DATA_TYPE_16SC2_get());
  public final static ImageDataType IMAGE_DATA_TYPE_16SC3 = new ImageDataType("IMAGE_DATA_TYPE_16SC3", opencvpJNI.IMAGE_DATA_TYPE_16SC3_get());
  public final static ImageDataType IMAGE_DATA_TYPE_16SC4 = new ImageDataType("IMAGE_DATA_TYPE_16SC4", opencvpJNI.IMAGE_DATA_TYPE_16SC4_get());
  public final static ImageDataType IMAGE_DATA_TYPE_32SC1 = new ImageDataType("IMAGE_DATA_TYPE_32SC1", opencvpJNI.IMAGE_DATA_TYPE_32SC1_get());
  public final static ImageDataType IMAGE_DATA_TYPE_32SC2 = new ImageDataType("IMAGE_DATA_TYPE_32SC2", opencvpJNI.IMAGE_DATA_TYPE_32SC2_get());
  public final static ImageDataType IMAGE_DATA_TYPE_32SC3 = new ImageDataType("IMAGE_DATA_TYPE_32SC3", opencvpJNI.IMAGE_DATA_TYPE_32SC3_get());
  public final static ImageDataType IMAGE_DATA_TYPE_32SC4 = new ImageDataType("IMAGE_DATA_TYPE_32SC4", opencvpJNI.IMAGE_DATA_TYPE_32SC4_get());
  public final static ImageDataType IMAGE_DATA_TYPE_32FC1 = new ImageDataType("IMAGE_DATA_TYPE_32FC1", opencvpJNI.IMAGE_DATA_TYPE_32FC1_get());
  public final static ImageDataType IMAGE_DATA_TYPE_32FC2 = new ImageDataType("IMAGE_DATA_TYPE_32FC2", opencvpJNI.IMAGE_DATA_TYPE_32FC2_get());
  public final static ImageDataType IMAGE_DATA_TYPE_32FC3 = new ImageDataType("IMAGE_DATA_TYPE_32FC3", opencvpJNI.IMAGE_DATA_TYPE_32FC3_get());
  public final static ImageDataType IMAGE_DATA_TYPE_32FC4 = new ImageDataType("IMAGE_DATA_TYPE_32FC4", opencvpJNI.IMAGE_DATA_TYPE_32FC4_get());
  public final static ImageDataType IMAGE_DATA_TYPE_64FC1 = new ImageDataType("IMAGE_DATA_TYPE_64FC1", opencvpJNI.IMAGE_DATA_TYPE_64FC1_get());
  public final static ImageDataType IMAGE_DATA_TYPE_64FC2 = new ImageDataType("IMAGE_DATA_TYPE_64FC2", opencvpJNI.IMAGE_DATA_TYPE_64FC2_get());
  public final static ImageDataType IMAGE_DATA_TYPE_64FC3 = new ImageDataType("IMAGE_DATA_TYPE_64FC3", opencvpJNI.IMAGE_DATA_TYPE_64FC3_get());
  public final static ImageDataType IMAGE_DATA_TYPE_64FC4 = new ImageDataType("IMAGE_DATA_TYPE_64FC4", opencvpJNI.IMAGE_DATA_TYPE_64FC4_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static ImageDataType swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + ImageDataType.class + " with value " + swigValue);
  }

  private ImageDataType(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private ImageDataType(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private ImageDataType(String swigName, ImageDataType swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static ImageDataType[] swigValues = { IMAGE_DATA_TYPE_8UC1, IMAGE_DATA_TYPE_8UC2, IMAGE_DATA_TYPE_8UC3, IMAGE_DATA_TYPE_8UC4, IMAGE_DATA_TYPE_8SC1, IMAGE_DATA_TYPE_8SC2, IMAGE_DATA_TYPE_8SC3, IMAGE_DATA_TYPE_8SC4, IMAGE_DATA_TYPE_16UC1, IMAGE_DATA_TYPE_16UC2, IMAGE_DATA_TYPE_16UC3, IMAGE_DATA_TYPE_16UC4, IMAGE_DATA_TYPE_16SC1, IMAGE_DATA_TYPE_16SC2, IMAGE_DATA_TYPE_16SC3, IMAGE_DATA_TYPE_16SC4, IMAGE_DATA_TYPE_32SC1, IMAGE_DATA_TYPE_32SC2, IMAGE_DATA_TYPE_32SC3, IMAGE_DATA_TYPE_32SC4, IMAGE_DATA_TYPE_32FC1, IMAGE_DATA_TYPE_32FC2, IMAGE_DATA_TYPE_32FC3, IMAGE_DATA_TYPE_32FC4, IMAGE_DATA_TYPE_64FC1, IMAGE_DATA_TYPE_64FC2, IMAGE_DATA_TYPE_64FC3, IMAGE_DATA_TYPE_64FC4 };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

