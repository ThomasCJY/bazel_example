load("@rules_jvm_external//:defs.bzl", "artifact")

android_library(
    name = "my_lib",
    srcs = glob(["java/com/example/bazel/*.java"]),
    custom_package = "com.example.bazel",
    manifest = "java/AndroidManifest.xml",
    resource_files = glob(["res/**"]),
    visibility = ["//src/test:__subpackages__"],
    deps = [
        "@maven//:com_google_guava_guava",
        artifact("androidx.appcompat:appcompat"),
        artifact("androidx.annotation:annotation"),
    ],
)

android_library(
    name = "test_lib",
    srcs = glob(["java/com/example/test/*.java"]),
    custom_package = "com.example.bazel",
    manifest = "java/AndroidManifest.xml",
    resource_files = glob(["res/**"]),
    visibility = ["//src/test:__subpackages__"],
    deps = [
        "@maven//:junit_junit",
        "@maven//:com_google_guava_guava",
        artifact("androidx.appcompat:appcompat"),
        artifact("androidx.annotation:annotation"),
    ],
)
