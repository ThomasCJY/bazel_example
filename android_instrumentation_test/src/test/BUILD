android_binary(
    name = "greeter_test_app",
    assets = glob(
        ["assets/**"],
        exclude = ["assets/abc.txt", "**/.DS_Store"]),
    assets_dir = "assets",
    custom_package = "com.example.bazel.test",
    instruments = "//src/main:greeter_app",
    manifest = "AndroidManifest.xml",
    deps = ["//src/test/java/com/example/bazel:greeter_test_lib"],
)

#android_instrumentation_test(
#    name = "greeter_test",
#    target_device = "@android_test_support//tools/android/emulated_devices/generic_phone:android_23_x86_qemu2",
#    test_app = ":greeter_test_app",
#)

#load("@spoon_instrumentation_test//:defs.bzl", "spoon_instrumentation_test")
#
#spoon_instrumentation_test(
#    name = "greeter_test_spoon",
#    # Size must be large to accommodate for up to 900s test execution time
#    size = "small",
#    device_type = "local",  # pixel, pixel_c, nexus_4, generic_4_7, etc.
#    test_app = ":greeter_test_app",
#)
