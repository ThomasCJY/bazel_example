package com.example.bazel;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

public class SimpleJunitTest {

    @Test
    public void testSimpleAdd() {
        Assert.assertEquals(23, 1+1);
    }

}
