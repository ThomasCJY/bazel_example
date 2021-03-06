package(
    default_visibility = ["//src:__subpackages__"],
)

java_library(
    name = "util",
    srcs = ["JavaUtil.java"],
    visibility = ["//visibility:public"],
    deps = [],
)

android_library(
    name = "greeter_activity",
    srcs = [
        "Greeter.java",
        "MainActivity.java",
    ],
    manifest = "AndroidManifest.xml",
    resource_files = glob(["res/**"]),
)
