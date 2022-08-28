package com.bootcoding.basic.maths;

public class MathsUtility {

    public static int getASquareMinusBSquareMethod(int a, int b){
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
    public static int getAPlusBWholeSquareMethod(int a, int b) {
        // (a + b)2 = a2 + 2ab + b2.
        return ((a * a) + (2 * a * b) + (b * b));
    }
    public static int getASquarePlusBSquare(int a, int b) {
        // a2+ b2 = (a + b)2 – 2ab
        return ((a + b) * (a + b) - (2 * a * b));
    }
    public static int getAMinusBWholeSquare(int a, int b) {
        // (a – b)2 = a2 – 2ab + b2.
    return ((a*a)-(2*a*b)+(b*b));
    }
    public static int getAPlusBPlusCWholeSquare(int a, int b, int c) {
        // (a + b + c)2 = a2 + b2 + c2 + 2ab + 2bc + 2ca
        return ((a * a) + (b * b) + (c * c) + (2 * a * b) + (2 * b * c) + (2 * c * a));
    }
    public static int getAMinusBMinusCWholeSquare(int a, int b, int c) {
        // (a – b – c)2 = a2 + b2 + c2 – 2ab + 2bc – 2ca
    return ((a*a)+(b*b)+(c*c)-(2*a*b)+(2*b*c)+(2*c*a));
    }
    public static int getAPlusBCube(int a, int b) {
        // (a + b)3 = a3 + 3a2b + 3ab2 + b2
    return ((a*a*a)+(3*a*2*b)+(3*a*b*2)+(b*b));
    }
    public static int getAMinuBCube(int a, int b){
        // (a – b)3 = a3 – 3a2b + 3ab2 – b3
return ((a*a*a)-(3*a*2*b)+(3*a*b*2)-(b*b*b));
    }

        public static void main(String[] args) {
        MathsUtility object=new MathsUtility();
        System.out.println("a^2+b^2= "+getASquareMinusBSquareMethod(6,5));
        System.out.println("(a+b)^2="+getAPlusBWholeSquareMethod(5,6));
            System.out.println("a^2+b^2="+getASquarePlusBSquare(5,6));
            System.out.println("(a-b)^2="+getAMinusBWholeSquare(5,6));
            System.out.println("(a+b+c)^2="+getAPlusBPlusCWholeSquare(5,6,7));
            System.out.println("(a-b-c)^2="+getAMinusBMinusCWholeSquare(5,6,7));
            System.out.println("(a + b)^3="+getAPlusBCube(5, 6 ));
            System.out.println("(a – b)^3="+getAMinuBCube(5,6));
    }


}


