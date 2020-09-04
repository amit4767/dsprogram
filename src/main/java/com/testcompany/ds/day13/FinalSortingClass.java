package com.testcompany.ds.day13;

public class FinalSortingClass {

    public int [] mergeSort(int []arr , int low , int high){

        if(low < high){
            int mid = (low+high)/2;
            mergeSort(arr ,low , mid);
            mergeSort(arr, mid+1 ,high);
            merge(arr,low,mid,high);
        }
        return arr;
    }

    private void merge(int [] arr , int low , int mid , int high){

          int [] temparr  =  new int[arr.length];
          int k = low;
          int i = low;
          int j = mid+1;

          while(i <= mid && j <= high){
              if(arr[i] <= arr[j]){
                  temparr[k] =arr[i];
                  i++;
              }else {
                  temparr[k] = arr[j];
                  j++;
              }
               k++;
          }

          if(i > mid){
              while (j<= high){
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

          for(k = low ; k <= high ;k++){
              arr[k] = temparr[k];
          }

    }

    public int [] quickSort2(int []arr , int low , int high){

        if(low < high){

            int loc = quick(arr,low ,high);
            quickSort2(arr ,low , loc -1);
            quickSort2(arr ,loc+1, high);

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

    public int [] HeapSort(int [] arr){

        int len = arr.length;
        for(int i =  len/2- 1; i >=0 ; i--){
            hepy(arr,len ,i);

        }

        for(int n = len -1 ; n > 0 ; n --){
             int temp = arr[0];
             arr[0] = arr[n];
             arr[n] =temp;

            hepy(arr,n ,0);

        }

        return arr;
    }

     private  void hepy(int [] arr  ,int len , int parentNode ){
        int left =  parentNode*2 +1;
        int right = parentNode*2 +2;
        int currentMaxIndex = parentNode;

        if( left < len && arr[left]  > arr[currentMaxIndex]){
            currentMaxIndex = left;
        }
         if( right < len && arr[right]  > arr[currentMaxIndex]){
             currentMaxIndex = right;
         }

         if(currentMaxIndex != parentNode){
             int temp = arr[currentMaxIndex];
             arr[currentMaxIndex]  = arr[parentNode];
             arr[parentNode]  = temp;
         }

     }
}
