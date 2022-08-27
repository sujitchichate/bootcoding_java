package com.bootcoding.basic;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class Sample1Test extends TestCase {

    @Test
    public void testSeparateWord() {
        Sample1 object = new Sample1();
        String str1ActualVariable = "My,Name";
        String[] s2ExpectedVariable={"My","Name"};
        Assert.assertArrayEquals(s2ExpectedVariable, object.separateWord(str1ActualVariable));
    }
}