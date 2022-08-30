package com.bootcoding.basic;

public class PrimeNumberSeries {
    public static void main(String[] args) {
        int n = 1000;
boolean flag=false;
        for (int i = 2; i < n/2; i++) {//here we take i=2 not i=1 because any number is divisible by 1 or itself
            if (n % i == 0) {
                flag = true;
            }
        }
        if (flag){
            System.out.println("not a prime");
        }else{
            System.out.println("prime");
        }
    }
}
