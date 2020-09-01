package com.testcompany.ds.day10;

public class QuikSort {

    public int [] quickSort( int [] arr , int lower , int upper){

          if(lower < upper){

              int loc =  partition(arr , lower , upper);

              quickSort(arr, lower , loc-1);
              quickSort(arr ,loc +1 ,upper);

          }

          return  arr;
    }

    private  int partition(int [] arr , int lower , int upper ){

        int pivot = arr[lower];
        int start = lower;
        int end = upper;

        while(start < end){


            while( arr[start] <= pivot){
                start ++;
            }
            while(arr[end]  > pivot){
                end--;
            }

            if(start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }


        }

        int temp = arr[lower];
        arr[lower] = arr[end];
        arr[end] = temp;



        return  end;
    }
}
