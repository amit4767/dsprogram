package com.testcompany.ds.day1;

public class BubbleAlgo {

    public int[] SortArray(int[] arr) {
        int len = arr.length;
        int flag = 1;
        for (int i = 0; i < len - 1 && flag == 1; i++) {
            flag = 0;
            for (int j = 0; j < len - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    flag = 1;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }


        }


        return arr;
    }
}
