package com.bootcoding.sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {100, 30, 70, 40, 55};
        int n = arr.length;
        int min_index = 0;


        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
        System.out.print("After sorting=");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");


        }

    }
}

