java_library(
    name = "test_test_resources",
    resources = ["resources/robolectric.properties"],
)

java_library(
    name = "java_tests",
    srcs = [
        "java/com/example/bazel/RoboTest.java",
        "java/com/example/bazel/BazelTestSuite.java",
        ],
    deps = [
        "//src/main:test_lib",
        "@maven//:junit_junit",
        "@maven//:com_google_guava_guava",
        "@maven//:org_assertj_assertj_core",
        "@maven//:org_robolectric_robolectric",
        "@robolectric//bazel:android-all",
    ],
)

android_local_test(
    name = "main_activity_test",
    custom_package = "com.example.bazel",
    manifest = "AndroidManifest.xml",
    test_class = "com.example.bazel.BazelTestSuite",
    runtime_deps = [":java_tests"],
    deps = [
        ":test_test_resources",
        "@maven//:junit_junit",
        "@maven//:com_google_guava_guava",
        "@maven//:org_assertj_assertj_core",
        "@maven//:org_robolectric_robolectric",
        "@robolectric//bazel:android-all",
    ],
)
