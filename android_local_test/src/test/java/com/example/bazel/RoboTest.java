package com.example.bazel;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

@RunWith(RobolectricTestRunner.class)
public class RoboTest {

    @Test
    public void justSimpleTest() {
        Assert.assertEquals("(546) 789-4545", "(546) 789-4545");
    }
}
