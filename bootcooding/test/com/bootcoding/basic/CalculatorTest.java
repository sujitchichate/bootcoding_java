package com.bootcoding.basic;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void test1(){
        Calculator calc=new Calculator();
        int add = calc.Calculator(10, 20, "Add");
        Assert.assertTrue(add==30);
    }
    @Test
    public void test2(){
        Calculator calc=new Calculator();
        int mul = calc.Calculator(10, 20, "Mul");
        Assert.assertTrue(mul==200);
    }
    @Test
    public void test3(){
        Calculator calc=new Calculator();
        int sub = calc.Calculator(10, 5, "Sub");
        Assert.assertTrue(sub==5);
    }
    @Test
    public void test4(){
        Calculator calc=new Calculator();
        int div = calc.Calculator(20, 10, "Div");
        Assert.assertTrue(div==2);
    }



}
