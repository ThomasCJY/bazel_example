package com.example.bazel

import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner

@RunWith(RobolectricTestRunner::class)
class KotlinTest {

    @Test
    fun testBasics() {
        Assert.assertEquals("test", "test")
    }
}