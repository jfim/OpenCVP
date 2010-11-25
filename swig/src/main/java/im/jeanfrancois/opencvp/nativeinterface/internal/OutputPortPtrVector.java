/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package im.jeanfrancois.opencvp.nativeinterface.internal;

public class OutputPortPtrVector {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public OutputPortPtrVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(OutputPortPtrVector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opencvpJNI.delete_OutputPortPtrVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public OutputPortPtrVector() {
    this(opencvpJNI.new_OutputPortPtrVector__SWIG_0(), true);
  }

  public OutputPortPtrVector(long n) {
    this(opencvpJNI.new_OutputPortPtrVector__SWIG_1(n), true);
  }

  public long size() {
    return opencvpJNI.OutputPortPtrVector_size(swigCPtr, this);
  }

  public long capacity() {
    return opencvpJNI.OutputPortPtrVector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    opencvpJNI.OutputPortPtrVector_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return opencvpJNI.OutputPortPtrVector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    opencvpJNI.OutputPortPtrVector_clear(swigCPtr, this);
  }

  public void add(OutputPort x) {
    opencvpJNI.OutputPortPtrVector_add(swigCPtr, this, OutputPort.getCPtr(x), x);
  }

  public OutputPort get(int i) {
    long cPtr = opencvpJNI.OutputPortPtrVector_get(swigCPtr, this, i);
    return (cPtr == 0) ? null : new OutputPort(cPtr, false);
  }

  public void set(int i, OutputPort val) {
    opencvpJNI.OutputPortPtrVector_set(swigCPtr, this, i, OutputPort.getCPtr(val), val);
  }

}
