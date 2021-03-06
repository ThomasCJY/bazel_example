package com.example.unit;


import com.example.bazel.JavaUtil;

import org.junit.Assert;
import org.junit.Test;

public class SimpleTest {

    @Test
    public void atest() {
        JavaUtil javaUtil = new JavaUtil();
        Assert.assertEquals(javaUtil.simpleAdd(1,2), 3);
        Assert.assertEquals(javaUtil.simpleAdd(1,3), 4);
    }
}
