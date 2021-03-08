Test coverage data cannot be generated through
```
bazelisk coverage //src/test/java/com/example/unit:SimpleTest --combined_report=lcov --instrument_test_targets 

=======
also tried adding --coverage_report_generator=@bazel_tools//tools/test/CoverageOutputGenerator/java/com/google/devtools/coverageoutputgenerator:Main
```

both
`/home/tchen/.cache/bazel/_bazel_tchen/d1a0e72606327e40b47cda69b4cf12d4/execroot/__main__/bazel-out/_coverage/_coverage_report.dat` 
 and `bazel-out/_coverage/_coverage_report.dat`
is empty


```
Mar 05, 2021 5:41:41 PM com.google.devtools.coverageoutputgenerator.Main getTracefiles
INFO: Found 1 tracefiles.
Mar 05, 2021 5:41:41 PM com.google.devtools.coverageoutputgenerator.Main parseFilesSequentially
INFO: Parsing file bazel-out/darwin-fastbuild/testlogs/src/test/java/com/example/unit/SimpleTest/coverage.dat
Mar 05, 2021 5:41:41 PM com.google.devtools.coverageoutputgenerator.Main getGcovInfoFiles
INFO: No gcov info file found.
Mar 05, 2021 5:41:41 PM com.google.devtools.coverageoutputgenerator.Main getGcovJsonInfoFiles
INFO: No gcov json file found.
Mar 05, 2021 5:41:41 PM com.google.devtools.coverageoutputgenerator.Main getProfdataFileOrNull
INFO: No .profdata file found.
Mar 05, 2021 5:41:41 PM com.google.devtools.coverageoutputgenerator.Main runWithArgs
WARNING: There was no coverage found.
```