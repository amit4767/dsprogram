package com.testcompany.ds.day9;

public class MergeSortTryMyself {

    public  int []  mergersort(int [] arr , int low , int high){

          if(low <high){

              int mid = (low + high)/2;
              mergersort(arr,low, mid);
              mergersort(arr,mid+1 ,high);
              merge(arr, low ,mid ,high);

          }

        return  arr;
    }

    private void  merge(int [] arr , int low , int mid , int high){

        int k = low ;
        int i = low ;
        int j = mid +1;
        int [] temparr = new int[arr.length];

        while( i <= mid && j <= high){
            if(arr[i] < arr[j]){
                temparr[k] = arr[i];
                i++;
            }else {
                 temparr[k] = arr[j];
                 j++;
            }
            k++;
        }

        if(i > mid){

             while( j <= high){
                 temparr[k] = arr[j];
                 k++;
                 j++;
             }

        }else {
             while(i <= mid){
                 temparr[k] = arr[i];
                  k++;
                  i++;
             }
        }

        for(k = low; k <= high ;k++){
            arr[k] = temparr[k];
        }

    }
}
