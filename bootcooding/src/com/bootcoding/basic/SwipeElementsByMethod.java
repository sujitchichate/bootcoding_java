package com.bootcoding.basic;

public class SwipeElementsByMethod {
    public static void main(String[] args) {
        // int a[]={10,15,20,25,30,35,80,90};
        //int n=a[0];

        System.out.println("New array after swaping the first and last elements: ");
        SwipeElementsByMethod object = new SwipeElementsByMethod();
        object.swipe();
    }

      int swipe() {
        int a[] = {10, 15, 20, 25, 30, 35, 80, 90};
        int n = a[0];
        a[0] = a[a.length - 1];
        a[a.length - 1] = n;
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }return 0;
    }

}
