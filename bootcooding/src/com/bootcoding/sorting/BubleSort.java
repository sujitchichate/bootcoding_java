package com.bootcoding.sorting;

public class BubleSort {
    public static void main(String[] args) {
        int arr[] = {100, 30, 70, 40, 55};
        int n = arr.length;


        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

                }
            }System.out.print("After sorting=");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}