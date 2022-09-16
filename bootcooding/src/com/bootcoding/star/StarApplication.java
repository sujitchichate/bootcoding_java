package com.bootcoding.star;

public class StarApplication {
    //int n=3;

    public static void main(String[] args) {
        int n = 4;
        //int m = 5;
        //1
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        //2
        System.out.println("------------------------------------------------------------------------");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        //3
        System.out.println("------------------------------------------------------------------------");
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();

        }
        //4
//        System.out.println("------------------------------------------------------------------------");
//        for (int i = 1; i <= n; i++) {
//            for (int j = n; j >= i; j--) {
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }
        //4
        System.out.println("------------------------------------------------------------------------");
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                System.out.print("*");
            }
            System.out.println();


        }
        //5
//        System.out.println("------------------------------------------------------------------------");
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//
//
//        }
        //6
//        System.out.println("------------------------------------------------------------------------");
//        for (int i = 1; i <= n; i++) {
//            for (int j = 0; j <= n - i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//
//
//        }
    }
}