package com.testcompany.ds.day12;

public class AllSortingTwo {

    public int []  bubbleSort( int [] arr){

        boolean flag  = true ;
        for(int i = 0 ; i < arr.length && flag ; i++){
             flag = false;

           for(int j = 0 ; j <arr.length -1 -i ; j++){

               if(arr[j] > arr[j+1]){
                   int temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
                   flag = true;
               }
           }


        }

        return  arr;

    }

    public  int [] insertSort(int [] arr){
        for(int i = 1 ;i < arr.length ; i++){
            int j = i-1;
            int temp = arr[i];
            while(j >= 0 && temp < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
        return  arr;
    }

    public  int [] selectionSort(int [] arr){

        for(int i =0 ; i < arr.length ; i++){

              int minIndex = i ;
              int minValue = arr[i];

            for(int j =i ; j< arr.length ; j++){

                if(minValue > arr[j]){
                    minValue = arr[j];
                    minIndex = j;
                }

                if(minIndex != i){

                    int temp = arr[minIndex];
                    arr[minIndex] = arr[i];
                    arr[i] = temp;
                }
            }


        }
        return  arr;
    }

    public  int [] mergSort(int [] arr , int low , int high ){

        if(low < high){

            int mid =(low + high)/2;
            mergSort(arr , low ,mid);
            mergSort(arr,mid +1,high);
            merge(arr,low ,mid ,high);
        }
        return  arr;
    }

    private  void merge(int [] arr , int low , int mid , int high){

        int [] temparr =  new int[arr.length];
        int i = low;
        int k = low;
        int j = mid+1;

        while(i <=mid  &&  j <= high){
             if(arr[i] <= arr[j]){
                 temparr[k] = arr[i];
                 i++;
             }else {
                 temparr[k] = arr[j];
                 j++;
             }

             k++;
        }

        if( i > mid){

              while(j <= high){

                  temparr[k] = arr[j];
                  j++;
                  k++;
              }

        }else {

            while (i<= mid){
                temparr[k] = arr[i];
                i++;
                k++;
            }
        }

        for(k = low; k <= high ; k++){
            arr[k] = temparr[k];

        }


    }

    public  int [] QuickSort(int [] arr , int low , int high){


        if( low  < high){
            int loc =  quick( arr ,  low ,  high);
            QuickSort(arr ,low , loc -1);
            QuickSort(arr ,loc +1 , high);

        }
        return  arr;
    }

   private int quick(int [] arr , int low , int high){
        int  start = low;
        int  pivot = arr[low];
        int  end = high;

        while(start < end){
              while(arr[start] <= pivot ){
                  start ++;
              }
              while (arr[end] > pivot){
                  end --;
              }

            if(start < end){
                int temp = arr[end];
                arr[end] = arr[start];
                arr[start] =temp;

            }
        }

        int temp = arr[end];
        arr[end] = arr[low];
        arr[low] = temp;

        return end;
    }

}
