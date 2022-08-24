package com.bootcoding.basic;

import org.junit.Assert;
import org.junit.Test;

public class Canteen1Test {
    @Test
    public void test1() {
        Canteen1 c = new Canteen1();
        double orderAmount = c.cafe("Masala Dosa");
        Assert.assertEquals(30.0, orderAmount, 0.001);

    }
    @Test
    public void test2() {
        Canteen1 c = new Canteen1();
        double orderAmount = c.cafe("Sambhar wada");
        Assert.assertEquals(20.0, orderAmount, 0.001);

    }@Test
    public void test3() {
        Canteen1 c = new Canteen1();
        double orderAmount = c.cafe("Idali");
        Assert.assertEquals(10.0, orderAmount, 0.001);

    }@Test
    public void test4(){
        Canteen1 c= new Canteen1();
        double orderAmount = c.cafe("Masala Dosa half plate");
        Assert.assertEquals(15.0, orderAmount,0.001);
    }

}
