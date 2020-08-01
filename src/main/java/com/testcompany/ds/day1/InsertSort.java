package com.testcompany.ds.day1;

public class InsertSort {

    public int[] sortArray(int[] arr) {
        int len = arr.length;
        for (int i = 1; i < len; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;

            }
            arr[j + 1] = temp;
        }
        return arr;
    }
}
