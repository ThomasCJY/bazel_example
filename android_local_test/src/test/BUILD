java_library(
    name = "test_test_resources",
    resources = ["resources/robolectric.properties"],
)

android_local_test(
    name = "main_activity_test",
    srcs = ["java/com/example/bazel/RoboTest.java"],
    manifest = "AndroidManifest.xml",
    test_class = "com.example.bazel.RoboTest",
    deps = [
        ":test_test_resources",
        "@maven//:junit_junit",
        "@maven//:org_assertj_assertj_core",
        "@maven//:org_robolectric_robolectric",
        "@robolectric//bazel:android-all",
    ],
)
