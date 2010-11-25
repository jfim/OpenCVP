/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package im.jeanfrancois.opencvp.nativeinterface.internal;

public class Filter {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public Filter(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Filter obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        throw new UnsupportedOperationException("C++ destructor does not have public access");
      }
      swigCPtr = 0;
    }
  }

  public void execute() {
    opencvpJNI.Filter_execute(swigCPtr, this);
  }

  public InputPortVector getInputPorts() {
    return new InputPortVector(opencvpJNI.Filter_getInputPorts(swigCPtr, this), true);
  }

  public OutputPortVector getOutputPorts() {
    return new OutputPortVector(opencvpJNI.Filter_getOutputPorts(swigCPtr, this), true);
  }

  public PropertyVector getProperties() {
    return new PropertyVector(opencvpJNI.Filter_getProperties(swigCPtr, this), true);
  }

}
