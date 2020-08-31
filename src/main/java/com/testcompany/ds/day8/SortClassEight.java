package com.testcompany.ds.day8;

public class SortClassEight {

    public  int [] bubbleSort(int [] arr ){
        boolean flag = true;
        for(int i = 0 ; i < arr.length  && flag; i++){
            flag = false;
            for(int j = 0 ; j< arr.length -i -1  ; j++){
                if(arr[j] >arr[j+1]){
                    flag = true;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return  arr;
    }

    public int []  insertionSort(int [] arr){
         for( int i = 0;  i < arr.length ; i++ ){
             int temp = arr[i];
             int j = i-1;
             while(j >=0  && arr[j] > temp){
                 arr[j+1] = arr[j];
                  j--;
             }
             arr[j+1] = temp;
         }
         return  arr;
        }
}
