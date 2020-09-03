package com.testcompany.ds.day10;

import java.util.Arrays;

public class HeapSort {

    public int [] heapsort(int [] arr ){

         int len = arr.length ;

        for(int i = len/2 -1; i >=0 ; i --) {

            //max hip logic 
            method(arr, len,i);
        }
            // delete max heap element

        System.out.println(" heapsort before delete "+ Arrays.toString (arr));
           for(int n= arr.length -1  ; n >0 ; n --){

                int temp = arr[n];
                arr[n] = arr[0];
                arr[0]  = temp;
                 method(arr, n,0);

           }


        return arr;
    }

    private void method(int [] arr , int starleng ,int assumerlage) {

           int currentMaxValue = assumerlage;
           int leftchild = assumerlage*2 +1 ;
           int righchild = assumerlage*2 +2;

           if ( leftchild < starleng && arr[leftchild] >arr[currentMaxValue] ){
               currentMaxValue = leftchild;
           }
         if( righchild < starleng && arr[righchild] >arr[currentMaxValue] ){
            currentMaxValue = righchild;
          }

          if(assumerlage != currentMaxValue){

             int temp = arr[assumerlage];
             arr[assumerlage] = arr[currentMaxValue];
             arr[currentMaxValue] = temp;

             method(arr, starleng ,currentMaxValue);
         }

        System.out.println(" output of array in heapfiy  "+ Arrays.toString (arr));

    }

}
