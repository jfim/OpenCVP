/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package im.jeanfrancois.opencvp.nativeinterface.internal;

public class opencvpJNI {
  public final static native long new_StringVector__SWIG_0();
  public final static native long new_StringVector__SWIG_1(long jarg1);
  public final static native long StringVector_size(long jarg1, StringVector jarg1_);
  public final static native long StringVector_capacity(long jarg1, StringVector jarg1_);
  public final static native void StringVector_reserve(long jarg1, StringVector jarg1_, long jarg2);
  public final static native boolean StringVector_isEmpty(long jarg1, StringVector jarg1_);
  public final static native void StringVector_clear(long jarg1, StringVector jarg1_);
  public final static native void StringVector_add(long jarg1, StringVector jarg1_, String jarg2);
  public final static native String StringVector_get(long jarg1, StringVector jarg1_, int jarg2);
  public final static native void StringVector_set(long jarg1, StringVector jarg1_, int jarg2, String jarg3);
  public final static native void delete_StringVector(long jarg1);
  public final static native long new_FilterLibraryVector__SWIG_0();
  public final static native long new_FilterLibraryVector__SWIG_1(long jarg1);
  public final static native long FilterLibraryVector_size(long jarg1, FilterLibraryVector jarg1_);
  public final static native long FilterLibraryVector_capacity(long jarg1, FilterLibraryVector jarg1_);
  public final static native void FilterLibraryVector_reserve(long jarg1, FilterLibraryVector jarg1_, long jarg2);
  public final static native boolean FilterLibraryVector_isEmpty(long jarg1, FilterLibraryVector jarg1_);
  public final static native void FilterLibraryVector_clear(long jarg1, FilterLibraryVector jarg1_);
  public final static native void FilterLibraryVector_add(long jarg1, FilterLibraryVector jarg1_, long jarg2, FilterLibrary jarg2_);
  public final static native long FilterLibraryVector_get(long jarg1, FilterLibraryVector jarg1_, int jarg2);
  public final static native void FilterLibraryVector_set(long jarg1, FilterLibraryVector jarg1_, int jarg2, long jarg3, FilterLibrary jarg3_);
  public final static native void delete_FilterLibraryVector(long jarg1);
  public final static native int IMAGE_DATA_TYPE_8UC1_get();
  public final static native int IMAGE_DATA_TYPE_8UC2_get();
  public final static native int IMAGE_DATA_TYPE_8UC3_get();
  public final static native int IMAGE_DATA_TYPE_8UC4_get();
  public final static native int IMAGE_DATA_TYPE_8SC1_get();
  public final static native int IMAGE_DATA_TYPE_8SC2_get();
  public final static native int IMAGE_DATA_TYPE_8SC3_get();
  public final static native int IMAGE_DATA_TYPE_8SC4_get();
  public final static native int IMAGE_DATA_TYPE_16UC1_get();
  public final static native int IMAGE_DATA_TYPE_16UC2_get();
  public final static native int IMAGE_DATA_TYPE_16UC3_get();
  public final static native int IMAGE_DATA_TYPE_16UC4_get();
  public final static native int IMAGE_DATA_TYPE_16SC1_get();
  public final static native int IMAGE_DATA_TYPE_16SC2_get();
  public final static native int IMAGE_DATA_TYPE_16SC3_get();
  public final static native int IMAGE_DATA_TYPE_16SC4_get();
  public final static native int IMAGE_DATA_TYPE_32SC1_get();
  public final static native int IMAGE_DATA_TYPE_32SC2_get();
  public final static native int IMAGE_DATA_TYPE_32SC3_get();
  public final static native int IMAGE_DATA_TYPE_32SC4_get();
  public final static native int IMAGE_DATA_TYPE_32FC1_get();
  public final static native int IMAGE_DATA_TYPE_32FC2_get();
  public final static native int IMAGE_DATA_TYPE_32FC3_get();
  public final static native int IMAGE_DATA_TYPE_32FC4_get();
  public final static native int IMAGE_DATA_TYPE_64FC1_get();
  public final static native int IMAGE_DATA_TYPE_64FC2_get();
  public final static native int IMAGE_DATA_TYPE_64FC3_get();
  public final static native int IMAGE_DATA_TYPE_64FC4_get();
  public final static native long ExecutionModel_createFilterChain(long jarg1, ExecutionModel jarg1_);
  public final static native long ExecutionModel_loadFilterChain(long jarg1, ExecutionModel jarg1_, String jarg2);
  public final static native void ExecutionModel_saveFilterChain(long jarg1, ExecutionModel jarg1_, long jarg2, FilterChain jarg2_, String jarg3);
  public final static native int ExecutionModel_getFilterChainInputPortCount(long jarg1, ExecutionModel jarg1_, long jarg2, FilterChain jarg2_);
  public final static native int ExecutionModel_getFilterChainOutputPortCount(long jarg1, ExecutionModel jarg1_, long jarg2, FilterChain jarg2_);
  public final static native int ExecutionModel_getFilterChainInputPortType(long jarg1, ExecutionModel jarg1_, long jarg2, FilterChain jarg2_, int jarg3);
  public final static native int ExecutionModel_getFilterChainOutputPortType(long jarg1, ExecutionModel jarg1_, long jarg2, FilterChain jarg2_, int jarg3);
  public final static native void ExecutionModel_setFilterChainImageInputPortData(long jarg1, ExecutionModel jarg1_, long jarg2, FilterChain jarg2_, int jarg3, int jarg4, int jarg5, int jarg6, short[] jarg7);
  public final static native void ExecutionModel_executeFilterChain(long jarg1, ExecutionModel jarg1_, long jarg2, FilterChain jarg2_);
  public final static native long ExecutionModel_getLoadedFilterLibraries(long jarg1, ExecutionModel jarg1_);
  public final static native long ExecutionModel_getInstance();
  public final static native void delete_FilterLibrary(long jarg1);
  public final static native boolean FilterLibrary_isValid(long jarg1, FilterLibrary jarg1_);
  public final static native String FilterLibrary_getVendor(long jarg1, FilterLibrary jarg1_);
  public final static native String FilterLibrary_getName(long jarg1, FilterLibrary jarg1_);
  public final static native String FilterLibrary_getVersion(long jarg1, FilterLibrary jarg1_);
  public final static native String FilterLibrary_getLibraryName(long jarg1, FilterLibrary jarg1_);
  public final static native long FilterLibrary_getFilterClassNames(long jarg1, FilterLibrary jarg1_);
  public final static native void delete_FilterChain(long jarg1);
  public final static native void FilterChain_addFilter(long jarg1, FilterChain jarg1_, long jarg2, Filter jarg2_);
  public final static native void FilterChain_execute(long jarg1, FilterChain jarg1_);
  public final static native void Filter_execute(long jarg1, Filter jarg1_);
}
