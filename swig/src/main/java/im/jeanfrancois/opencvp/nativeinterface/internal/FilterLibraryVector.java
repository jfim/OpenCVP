/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package im.jeanfrancois.opencvp.nativeinterface.internal;

public class FilterLibraryVector {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public FilterLibraryVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(FilterLibraryVector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opencvpJNI.delete_FilterLibraryVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public FilterLibraryVector() {
    this(opencvpJNI.new_FilterLibraryVector__SWIG_0(), true);
  }

  public FilterLibraryVector(long n) {
    this(opencvpJNI.new_FilterLibraryVector__SWIG_1(n), true);
  }

  public long size() {
    return opencvpJNI.FilterLibraryVector_size(swigCPtr, this);
  }

  public long capacity() {
    return opencvpJNI.FilterLibraryVector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    opencvpJNI.FilterLibraryVector_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return opencvpJNI.FilterLibraryVector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    opencvpJNI.FilterLibraryVector_clear(swigCPtr, this);
  }

  public void add(FilterLibrary x) {
    opencvpJNI.FilterLibraryVector_add(swigCPtr, this, FilterLibrary.getCPtr(x), x);
  }

  public FilterLibrary get(int i) {
    long cPtr = opencvpJNI.FilterLibraryVector_get(swigCPtr, this, i);
    return (cPtr == 0) ? null : new FilterLibrary(cPtr, false);
  }

  public void set(int i, FilterLibrary val) {
    opencvpJNI.FilterLibraryVector_set(swigCPtr, this, i, FilterLibrary.getCPtr(val), val);
  }

}
