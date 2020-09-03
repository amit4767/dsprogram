package com.testcompany.ds.day12;

public class AllSorting {

    public  int []  bubbleSort(int [] arr){
        boolean  isSorted = true;
        for(int i = 0 ; i < arr.length && isSorted; i ++){
                  isSorted = false;
            for(int j= 0 ; j < arr.length -1 -i; j++){
                if(arr[j] > arr[j+1]){
                    isSorted = true;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    public int [] insertSort(int [] arr){

        for(int i = 0 ; i < arr.length ; i++){
            int temp = arr[i];

            int j =i -1;
            while(j>=0  && temp < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
        return  arr;
    }

    public  int [] selection (int [] arr){
        for(int i = 0 ; i <arr.length ; i++){
            int minValue = arr[i];
            int minIndex = i;
            for(int j = i+1 ;j <arr.length  ; j++){
                 if( minValue > arr[j]){
                     minValue = arr[j];
                     minIndex = j;
                 }
            }
            if(minIndex != i){
                int temp = arr[minIndex];
                arr[minIndex]  =arr[i];
                arr[i] = temp;

            }
        }
        return  arr;
    }

    private  void  merge2(int [] arr , int low , int mid ,int high){
        int k = low;
        int i = low;
        int j = mid +1;
        int [] temparr  = new int[arr.length];

        while(i <= mid  && j <= high){
            if( arr[i] <= arr[j]){
                temparr[k] = arr[i];
                i++;
            }
            else if (arr[j] < arr[i]){
                temparr[k] = arr[j];
                j++;
            }
             k++;
        }
        if(i > mid){
              while(j <= high){
                  temparr[k] = arr[j];
                   j++;
                   k++;
              }
        }else {

             while (i <= mid){
                 temparr[k] = arr[i];
                 i++;
                 k++;
             }
        }

      //  System.out.println("temp array Sort ="+ Arrays.toString(temparr));
        for(k = low ; k <= high ; k++){
            arr[k]  =temparr[k];
        }

    }

    public  int [] mergeSort(int [] arr ,int lower , int upper ){

        if(lower < upper){
            int mid = ( lower + upper)/2;
            mergeSort( arr , lower , mid);
            mergeSort(arr , mid +1 , upper);
            merge2(arr , lower ,mid ,upper);
        }
        return  arr;
    }


    public  int [] quickSort(int []arr , int low , int high){

            if(low < high){
                int loc = quick(arr,low,high);
                quickSort(arr, low , loc-1);
                quickSort(arr , loc +1 , high);
            }

        return  arr;

    }

    private  int quick(int [] arr , int low , int high){

        int start = low +1;
        int end  = high;
        int pivot = arr[low];

        while (start <end){
            while( arr[start] <= pivot){
                start ++;
            }

            while( arr[end] > pivot){
                end --;
            }
            if(start < end){

                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
        }

            int temp = arr[low];
            arr[low]  = arr[end];
            arr[end] =  temp;


         return  end;
    }


}
