package com.testcompany.ds.day2;

public class AllAglo {

    public int [] bubbleSort(int[] arr){

        int len = arr.length;
        int flag = 1;
        for(int i = 0 ; i< len-1 && flag ==1 ; i++){

            for(int j=0 ; j <len -1-i ; j++){

                if(arr[j+1] < arr[j]){

                    int temp = arr[i];
                    arr[i] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return  arr;
    }

    public int [] insertSort(int[] arr){
        int len = arr.length;
        for(int i= 1 ; i <len ; i++)
        {
            int j = i -1;
            int temp = arr[i];
            while(j >=0 && temp < arr[j]){
                arr[j+1] =arr[j];
                j--;
            }
            arr[j+1] =temp;

        }
        return  arr;
    }

    public int [] seletioSort(int[] arr){

        int len = arr.length;
        for(int i =0 ; i <len ; i++){
            int min = arr[i];
            for(int j= i+1;i<len -1; j++){
                 if(arr[min] > arr[j]){

                     min =j;
                 }


            }
            if(min !=1 ){

            }
        }

          return  arr;
    }
 }
