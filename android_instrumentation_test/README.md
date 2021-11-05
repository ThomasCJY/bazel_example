Repro step:
1. `bazelisk build //src/test:greeter_test_app`
2. open generated apk `bazel-bin/src/test/greeter_test_app.apk`. Check the assets inside the apk. We can notice the assets contains `abc.txt`, which has been excluded in the [build script](src/test/BUILD)
3. comment out `build --persistent_android_resource_processor` in `.bazelrc` and repeat step 1 and 2. The issue is gone.
