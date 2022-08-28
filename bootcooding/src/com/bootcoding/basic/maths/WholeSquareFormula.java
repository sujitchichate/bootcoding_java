package com.bootcoding.basic.maths;

public class WholeSquareFormula {
    public static int getAPlusBWholeSquareMethod(int a, int b) {
        // (a + b)2 = a2 + 2ab + b2.
        return ((a * a) + (2 * a * b) + (b * b));
    }

    public static void main(String[] args) {
        WholeSquareFormula object=new WholeSquareFormula();
        System.out.println("(a+b)^2="+getAPlusBWholeSquareMethod(5,6));
    }
}
