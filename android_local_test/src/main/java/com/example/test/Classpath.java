package com.example.test;

import com.google.common.reflect.ClassPath;
import com.google.common.reflect.ClassPath.ClassInfo;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * A helper class to find all classes on the current classpath. This is used to automatically create
 * JUnit 3 and 4 test suites.
 */
public final class Classpath {

    /**
     * Base exception for any classpath related errors.
     */
    public static final class ClassPathException extends Exception {
        public ClassPathException(String format, Object... args) {
            super(String.format(format, args));
        }
    }

    /** Finds all classes that live in or below the given package. */
    public static Set<Class<?>> findClasses(String packageName) throws ClassPathException {
        Set<Class<?>> result = new LinkedHashSet<>();
        String packagePrefix = (packageName + '.').replace('/', '.');
        try {
            for (ClassInfo ci : ClassPath.from(Classpath.class.getClassLoader()).getAllClasses()) {
                if (ci.getName().startsWith(packagePrefix)) {
                    try {
                        result.add(ci.load());
                    } catch (UnsatisfiedLinkError | NoClassDefFoundError unused) {
                        // Ignore: we're most likely running on a different platform.
                    }
                }
            }
        } catch (IOException e) {
            throw new ClassPathException(e.getMessage());
        }
        return result;
    }
}