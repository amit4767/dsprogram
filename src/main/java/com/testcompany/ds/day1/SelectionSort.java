package com.testcompany.ds.day1;

public class SelectionSort {
    public  int [] sort(int [] arr){
        int len = arr.length;

        for(int i =0 ;i < len -1 ; i++){
            int min = i;
            for(int j = i+1 ; j < len ;j++){
                if(arr[min] > arr[j] ){
                     min = j;
                }
            }

            if( min != i ){
                int temp = arr[min];
                 arr[min] = arr[i];
                 arr[i] = temp;
            }


        }

        return arr;

        }
}
