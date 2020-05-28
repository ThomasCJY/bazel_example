package com.example.test;

import org.junit.runners.Suite;
import org.junit.runners.model.RunnerBuilder;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Set;

/**
 * A JUnit4 suite implementation that delegates the class finding to a {@code suite()} method on the
 * annotated class. To be used in combination with {@link TestSuiteBuilder}.
 */
public final class CustomSuite extends Suite {

    /**
     * Only called reflectively. Do not use programmatically.
     */
    public CustomSuite(Class<?> klass, RunnerBuilder builder) throws Throwable {
        super(builder, klass, getClasses(klass));
    }

    private static Class<?>[] getClasses(Class<?> klass) {
        Set<Class<?>> result = evalSuite(klass);
        return result.toArray(new Class<?>[result.size()]);
    }

    @SuppressWarnings("unchecked") // unchecked cast to a generic type
    private static Set<Class<?>> evalSuite(Class<?> klass) {
        try {
            Method m = klass.getMethod("suite");
            if (!Modifier.isStatic(m.getModifiers())) {
                throw new IllegalStateException("suite() must be static");
            }
            return (Set<Class<?>>) m.invoke(null);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }
}