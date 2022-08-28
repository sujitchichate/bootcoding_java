package com.bootcoding.basic.maths;

public class MathsUtility {

    public static int getASquareMinusBSquare(int a, int b){
        return ((a-b)*(a+b));
    // a2 – b2 = (a – b)(a + b)


// Write logic here to calculate above formula and return result
//public static void main(String[] args) {
//
//    int a=5;
//    int b=6;
//    int c=((a-b)*(a*b));
//    System.out.println("a2 -b2="+c);

}

    public static void main(String[] args) {
        MathsUtility object=new MathsUtility();
        System.out.println("a^2+b^2= "+getASquareMinusBSquare(6,5));
    }


}


