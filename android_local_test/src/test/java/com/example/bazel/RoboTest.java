package com.example.bazel;

import android.telephony.PhoneNumberUtils;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

@RunWith(RobolectricTestRunner.class)
public class RoboTest {

    @Test
    public void justSimpleTest() {
        String result = PhoneNumberUtils.formatNumber("5467894545", "US");
        Assert.assertEquals("5467894545", result);
    }
}
