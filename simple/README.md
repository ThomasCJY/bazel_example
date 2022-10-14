### Repro steps
In this test repo, we created this `TestJavaBinary` which will always fail if file with relative path `data/data.txt` cannot be located. 
We passed this file into the java binary using `data` and `jvm_flags = ["-Ddata.path=data/data.txt"],`.
Vanilla Java bin works if you call it directly through command line.
```bash
bazelisk build //example/java/src/main/com/example:test_java_bin
bazel-bin/example/java/src/main/com/example/test_java_bin

--- output ---
Data file exists! Content:example data2
```

However, the data class will not be picked up correctly if the binary is passed through `--proguard_top="//example/java/src/main/com/example:test_java_bin"` build flag

```bash
bazelisk build //:my_app

---- output ----
ERROR: /Users/jchen/Snapchat/Dev/bazel_local_test_example/simple/BUILD:8:15: Trimming binary with Proguard: //:my_app failed: (Exit 1): test_java_bin failed: error executing command (from target //:my_app) bazel-out/darwin_arm64-opt-exec-2B5CBBC6/bin/example/java/src/main/com/example/test_java_bin -forceprocessing -injars bazel-out/darwin_arm64-fastbuild/bin/my_app_deploy.jar -outjars ... (remaining 11 arguments skipped)

Use --sandbox_debug to see verbose messages from the sandbox and retain the sandbox build root for debugging
Exception in thread "main" java.lang.RuntimeException: No data file found under path - data/data.txt
        at example.java.src.main.com.example.TestJavaBinary.main(TestJavaBinary.java:18)
```

