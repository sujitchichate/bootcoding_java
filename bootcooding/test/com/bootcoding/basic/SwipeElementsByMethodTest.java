package com.bootcoding.basic;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class SwipeElementsByMethodTest extends TestCase {
    @Test
    public void testSwipe() {

        int a[] = {70, 15, 20, 25, 30, 35, 80, 90};

        int e[] = {90, 15, 20, 25, 30, 35, 80, 70};
        SwipeElementsByMethod object = new SwipeElementsByMethod();
        object.swipe(a);
        Assert.assertArrayEquals(e,a);
    }


    @Test
    public void testSwipe2() {

        int a[] = {70};

        int e[] = { 70};
        SwipeElementsByMethod object = new SwipeElementsByMethod();
        object.swipe(a);
        Assert.assertArrayEquals(e,a);
    }
}