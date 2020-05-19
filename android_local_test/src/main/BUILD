load("@rules_jvm_external//:defs.bzl", "artifact")

android_library(
    name = "my_lib",
    srcs = glob(["java/com/example/bazel/*.java"]),
    custom_package = "com.example.bazel",
    manifest = "java/AndroidManifest.xml",
    resource_files = glob(["res/**"]),
    visibility = ["//src/test:__subpackages__"],
    deps = [
        artifact("androidx.appcompat:appcompat"),
        artifact("androidx.annotation:annotation"),
    ],
)

load("@io_bazel_rules_kotlin//kotlin:kotlin.bzl", "kt_jvm_library")

kt_jvm_library(
    name = "example_kotlin",
    srcs = glob(["java/com/example/bazel/ExampleKotlinClass.kt"]),
    deps = [
    ],
)
