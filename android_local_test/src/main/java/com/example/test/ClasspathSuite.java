package com.example.test;

import org.junit.runners.Suite;
import org.junit.runners.model.RunnerBuilder;

import java.util.Set;

/**
 * A suite implementation that finds all JUnit 3 and 4 classes on the current classpath in or below
 * the package of the annotated class, except classes that are annotated with {@code ClasspathSuite}
 * or {@link CustomSuite}.
 *
 * <p>If you need to specify a custom test class filter or a different package prefix, then use
 * {@link CustomSuite} instead.
 */
public final class ClasspathSuite extends Suite {

    /**
     * Only called reflectively. Do not use programmatically.
     */
    public ClasspathSuite(Class<?> klass, RunnerBuilder builder) throws Throwable {
        super(builder, klass, getClasses(klass));
    }

    private static Class<?>[] getClasses(Class<?> klass) {
        Set<Class<?>> result = new TestSuiteBuilder().addPackageRecursive(klass.getPackage().getName())
                .create();
        return result.toArray(new Class<?>[result.size()]);
    }
}