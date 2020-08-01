package com.testcompany.ds.day1;

public class AllSortingAlgo {

    public int [] bubbleSort(int [] arr ){

        int len = arr.length;
        int flag = 1;
        for(int i= 0; i < len-1 && flag ==1 ;  i ++){
               flag = 0;
               for(int j = 0; j < len -1 -i ; j++){
                   if(arr[j] > arr[j+1]){
                       int temp = arr[j];
                       arr[j]= arr[j+1];
                       arr[j+1] = temp;
                       flag =1;
                   }
               }
        }
        return  arr;
    }

    public int [] selectionSort(int [] arr ){
        int len = arr.length;

        for(int i = 0;i < len ; i ++){
              int min =i;
              for(int j= i +1 ;j<len ;j++){
                  if(arr[j] < arr[min]){
                      min=j;
                  }
              }
              if(min != i){

                  int temp = arr[min];
                  arr[min] = arr[i];
                  arr[i] = temp;
              }

        }
        return  arr;
    }

    public int [] insertionSort(int [] arr ){
        int len = arr.length;
        for(int i =1 ; i < len ; i ++){
            int temp = arr[i];
             int j = i -1;
            while(j >= 0 && arr[j] >temp ){
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = temp;

        }

        return  arr;
    }
}
