package com.bootcoding.basic;

public class FibonacciSeries {
    public static void main(String[] args) {
        int p1 = 1;
        int p2 = 1;
        int res = 1;
        int n;
        n = 8;
        for (int i = 1; i < n; i++) {
            System.out.println(res);
            p2 = p1;
            p1 = res;
            res = p1 + p2;


        }
    }
}
