package com.testcompany.ds.day16;

public class SortingClass {

    public  int []  mergeSort(int [] arr , int low , int high){
        if(low < high){
            int mid = (low + high)/2;
            mergeSort(arr,low , mid);
            mergeSort(arr,mid+1 , high);
            merge(arr,low,mid,high);
        }
        return  arr;
    }

    private void merge(int [] arr , int low , int mid , int high){
          int [] temparr = new int[arr.length];
          int k = low;
          int i = low;
          int j = mid+1;

        while (i <= mid  && j <= high){

              if(arr[i] <= arr[j]){
                  temparr[k] = arr[i];
                  i++;
              }else if(arr[j] < arr[i]){
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
              while(i <= mid){
                  temparr[k] =arr[i];
                  i++;
                  k++;
              }

          }

          for(k = low ; k<= high ; k++){

              arr[k] = temparr[k];
          }

    }

    public   int [] quickSort(int [] arr , int low , int high){

        if(low < high){

            int mid = (low + high)/2;
            quickSort(arr, low , mid -1);
            quickSort(arr, mid +1 , high);


        }
        return  arr;

    }

    private int quik(int [] arr , int low , int high){

        int start = low ;
        int end = high ;
       // intmax
        return  0;
    }


}
