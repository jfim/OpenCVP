%module opencvp
%include "typemaps.i"
%include "std_string.i"
%include "std_vector.i"
%include "boost_shared_ptr.i"
%include "arrays_java.i"
%include "various.i"

%apply signed char[] { signed char* };

namespace std {
    %template(StringVector) vector<string>;
    %template(FilterLibraryVector) vector<FilterLibrary>;
}

%shared_ptr(FilterChain)

%{
#include "Container.h"
#include "ExecutionModel.h"
#include "FilterLibrary.h"
#include "FilterChain.h"
#include "Filter.h"
%}

%include "Container.h"
%include "ExecutionModel.h"
%include "FilterLibrary.h"
%include "FilterChain.h"
%include "Filter.h"

