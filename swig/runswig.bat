mkdir src\main\java\im\jeanfrancois\opencvp\nativeinterface\internal
swig -c++ -java -Isrc/main/swig -Isrc/main/c++ -I../executionmodel/src -I../filterlibrary/src -package im.jeanfrancois.opencvp.nativeinterface.internal -outdir src/main/java/im/jeanfrancois/opencvp/nativeinterface/internal -o src/main/c++/OpenCVP_wrap.cxx -v OpenCVPNativeInterface.i
