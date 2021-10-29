load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")

android_sdk_repository(
    name = "androidsdk",
    api_level = 30,
    build_tools_version = "30.0.2",
)

#android_ndk_repository(
#    name = "androidndk",
#)

RULES_JVM_EXTERNAL_TAG = "3.3"

RULES_JVM_EXTERNAL_SHA = "d85951a92c0908c80bd8551002d66cb23c3434409c814179c0ff026b53544dab"

http_archive(
    name = "rules_jvm_external",
    sha256 = RULES_JVM_EXTERNAL_SHA,
    strip_prefix = "rules_jvm_external-%s" % RULES_JVM_EXTERNAL_TAG,
    url = "https://github.com/bazelbuild/rules_jvm_external/archive/%s.zip" % RULES_JVM_EXTERNAL_TAG,
)

load("@rules_jvm_external//:defs.bzl", "maven_install")

local_repository(
    name = "spoon_instrumentation_test",
    path = "/Users/jchen/Snapchat/Dev/spoon_instrumentation_rule",
)

maven_install(
    artifacts = [
        "junit:junit:4.12",
        "com.google.inject:guice:4.0",
        "org.hamcrest:java-hamcrest:2.0.0.0",
        "androidx.test.espresso:espresso-core:3.1.1",
        "androidx.test:runner:1.1.1",
        "androidx.test:rules:1.1.1",
        "androidx.test.ext:junit:1.1.0",
    ],
    repositories = [
        "https://maven.google.com",
        "https://repo1.maven.org/maven2",
    ],
)

## Everything below this line is used for the Android testing tools and their dependencies
## ---------------------------------------------------------------------------------------
#
## Android Test Support
##
## This repository contains the supporting tools to run Android instrumentation tests,
## like the emulator definitions (android_device) and the device broker/test runner.
#ATS_TAG = "1edfdab3134a7f01b37afabd3eebfd2c5bb05151"
#
#ATS_SHA256 = "dcd1ff76aef1a26329d77863972780c8fe1fc8ff625747342239f0489c2837ec"
#
#http_archive(
#    name = "android_test_support",
#    sha256 = ATS_SHA256,
#    strip_prefix = "android-test-%s" % ATS_TAG,
#    urls = ["https://github.com/android/android-test/archive/%s.tar.gz" % ATS_TAG],
#)
#
#load("@android_test_support//:repo.bzl", "android_test_repositories")
#
#android_test_repositories()
#
#http_archive(
#    name = "bazel_toolchains",
#    sha256 = "4d348abfaddbcee0c077fc51bb1177065c3663191588ab3d958f027cbfe1818b",
#    strip_prefix = "bazel-toolchains-2.1.0",
#    urls = [
#        "https://github.com/bazelbuild/bazel-toolchains/releases/download/2.1.0/bazel-toolchains-2.1.0.tar.gz",
#        "https://mirror.bazel.build/github.com/bazelbuild/bazel-toolchains/archive/2.1.0.tar.gz",
#    ],
#)
#
#load("@bazel_toolchains//rules:rbe_repo.bzl", "rbe_autoconfig")
#
## Creates a default toolchain config for RBE.
## Use this as is if you are using the rbe_ubuntu16_04 container,
## otherwise refer to RBE docs.
#rbe_autoconfig(name = "buildkite_config")
#
#rbe_autoconfig(name = "rbe_default")
#
## RBE support for android_device and android_instrumentation_test on RBE.
#register_execution_platforms(":android_platform")


############### spoon rule
http_archive(
    name = "rules_pkg",
    url = "https://github.com/bazelbuild/rules_pkg/releases/download/0.3.0/rules_pkg-0.3.0.tar.gz",
    sha256 = "6b5969a7acd7b60c02f816773b06fcf32fbe8ba0c7919ccdc2df4f8fb923804a",
)
load("@rules_pkg//:deps.bzl", "rules_pkg_dependencies")
rules_pkg_dependencies()
