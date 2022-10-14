
android_library(
    name = "my_lib",
    exports = [
    ],
)

android_binary(
    name = "my_app",
    custom_package = "com.example.bazel",
    manifest = "AndroidManifest.xml",
    deps = [":my_lib"],
    # if proguard specs are commented out, `bazelisk build //:my_app` will pass
    proguard_specs = [
        "proguard-rules.pro",
    ],
)
