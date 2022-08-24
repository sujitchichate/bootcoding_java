package com.bootcoding.basic;

public class Array6 {
    public static void main(String[] args) {
        int a[] = {10, 15, 20, 25, 35, 75, 180, 95};
        boolean found=false;
        for (int i = 0; i < a.length; i++) {
            if (80 == a[i]) {
                found=true;//overriding

            }
        }
        if (found) {
            System.out.println("found");
        }else{
            System.out.println("not found");
        }

    }
}
