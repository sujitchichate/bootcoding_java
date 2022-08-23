package com.bootcoding.basic;

public class Array {
    public static void main(String[] args) {
        long[] b={10,20,30,40,50,25};
        String c[]={"Sujit","Manish"};
        int d[]=new int[5];
        d[0]=70;
        d[1]=80;
        d[2]=4;
        d[3]=6;
        d[4]=15;
        b[0]=10;
        b[1]=20;
        b[2]=30;
        b[3]=40;
        b[4]=50;
        b[5]=25;
        for(int i=0; i<d.length;i++){
            System.out.println(d[i]);
        }
        System.out.println(b[2]);
        System.out.println(d[1]);
for(int i=0; i<b.length;i++){
    System.out.println(b[1]);
}
    }
}
