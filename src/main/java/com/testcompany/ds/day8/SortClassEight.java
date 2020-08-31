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

     public  int [] selectionSort(int [] arr){
        for(int i = 0 ; i < arr.length ;i++){
            for(int j = i ; j < arr.length  -1; j++){
                 if(arr[i] >arr[j]){
                     int temp = arr[i];
                     arr[i] = arr[j];
                     arr[j] = temp;
                 }
            }
        }
        return  arr;
     }


    public  int [] selectionSortTwo(int [] arr){

        for(int i = 0 ;i < arr.length -1; i++){
            int min = i ;

            for(int j = i+1 ; j < arr.length ; j++){

                   if(arr[min] > arr[j]){
                       min = j;
                   }
            }

            if(min != i){
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i]  = temp;
            }


        }
        return  arr;
    }
}
