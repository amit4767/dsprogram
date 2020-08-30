package com.testcompany.ds.day7;

import java.util.Arrays;

public class DaySevenSorting {

    public int [] bubbleSort(int[] arr){
        int couter = 0;
        int len = arr.length;
        boolean isSorted = true;
        for(int i = 0; i <= len && isSorted ; i++){
            isSorted = false;
              couter++;
            for(int j = 0 ; j < len -i-1 ; j++){
                if( arr[j] > arr[j+1]){
                    couter ++;
                    isSorted = true;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }

        System.out.println(" total count  = "+couter);
        return  arr;

    }

    public int [] selectionSort(int[] arr){

        return  null;

    }

    public int [] insertSort(int[] arr){

        for(int i = 0 ; i < arr.length ; i++){
             int pivot = arr[i];
            System.out.println("before loop with condition [i][j] = ["+i+"] ="+ Arrays.toString(arr));
              for(int j = i ; j>0  ; j--){

                  System.out.println("before loop with condition [i][j] = ["+i+"]["+j+"] ="+ Arrays.toString(arr));
                if( pivot >  arr[j]){
                     int temp = arr[i];
                    // min = temp;
                    arr[i] = pivot;
                    arr[j+1]  = temp;


                    System.out.println("inside loop with condition [i][j] = ["+i+"]["+j+"] ="+ Arrays.toString(arr));
                    break;
                }
                  arr[j] = arr[j-1];


                  System.out.println("inside loop without condition [i][j] = ["+i+"]["+j+"] ="+ Arrays.toString(arr));
            }

            System.out.println("outside loop  = ["+i+"] ="+ Arrays.toString(arr));


        }
        return  arr;

    }
}
