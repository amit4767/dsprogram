package com.testcompany.ds.day3;

public class AllSorting {


    public int [] bubbleSort(int [] arr){
        int len = arr.length;
        int flag = 1;
        for(int i =0 ; i < len && flag ==1 ; i++){
            flag = 0;
            for(int j =0 ; j < len -1 -i; j++){
                if(arr[j+1] < arr[j]){
                    flag =1;
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return  arr;
    }

    public int []  insertionSort(int [] arr){
         int len = arr.length;
         for(int i= 0 ; i < len ; i ++){
              int  min = i;
              int j = i-1;
              while( j >= 0  &&  arr[min] < arr[j]){
                      arr[j+1]  = arr[j];
                       j = j -1;
              }
               arr[j+1] = arr[min];
         }
         return  arr;
    }

    public  int [] selectionSort(int [] arr){
        int len = arr.length;
        for(int i=0 ; i <len ; i++){
              int min = i;

            for(int j = i +1 ; j < len -1 ; j++){
                 if(arr[j] < min)
                      min = j;
            }
            if(min != i){
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }

        return  arr;


    }
}
