package com.testcompany.ds.day13;

public class ThreeSort {


    public int [] quickSort(int []arr , int low , int high){

        if(low < high){
            int loc = quick(arr,low ,high);
            quickSort(arr ,low , loc -1);
            quickSort(arr ,loc+1, high);

        }

        return  arr;
    }

    private  int quick1(int [] arr , int low , int high){

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
    private int quick(int [] arr , int low , int high){

         int pivot = arr[low];
         int start = low +1;
         int end = high;
         while( start < end){
             while (arr[start] <= pivot){
                 start ++;
             }
             while (arr[end] > pivot){
                 end --;
             }
             if(start < end){
                 int temp = arr[start];
                 arr[start] = arr[end];
                 arr[end] = temp;
             }
         }
         int temp = arr[low];
         arr[low]  =arr[end];
         arr[end] = temp;
        return  end;
    }
    public int [] mergeSort(int [] arr ,int low , int high){
        if(low < high){
            int mid = (low + high)/2;
            mergeSort(arr, low , mid);
            mergeSort(arr, mid+1 , high);
            merge(arr, low, mid, high);
        }
        return  arr;
    }
    private  void  merge(int [] arr , int low , int mid , int high){
        int i = low ;
        int k = low;
        int j = mid+1;
        int  []temparr  = new int[arr.length];
        while (i <= mid  && j <= high){
             if( arr[i] <= arr[j]){
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
                temparr[k]  = arr[j];
                j++;
                k++;
            }

        }else {
             while(i <= mid){
                  temparr[k]= arr[i];
                  i++;
                  k++;
             }
        }

        for(k = low ; k <=high ; k++){
            arr[k] =  temparr[k];
        }
    }

    public   int []  heapSort(int [] arr){
        int len = arr.length -1;
        for(int i = len/2 -1 ; i>=0 ;i--){
            heapipy(arr , len , i);
        }
        for(int n= len ; n > 0 ; n--){
             int temp = arr[0];
             arr[0]  = arr[n];
             arr[n] =temp;
            heapipy(arr , n , 0);
        }
        return  arr;
    }

    private  void heapfiy(int [] arr, int currlength, int  currentroot){

        int currentmax = currentroot;
        int left = currentroot*2 +1;
        int righ = currentroot*2 +2;

        if(left < currlength && arr[left] > arr[currentmax]){

            currentmax = left;
        }

        if(righ < currlength && arr[righ] > arr[currentmax]){
            currentmax = righ;
        }
        if(currentmax != currentroot){
            int temp =  arr[currentmax];
            arr[currentmax] = arr[currentroot];
            arr[currentroot] = temp;
            heapfiy(arr,currlength ,currentmax);

        }


    }

    private  void heapipy(int []arr , int currlength , int currentroot){

        int currentmax = currentroot;
        int left =  currentroot*2 +1;
        int righ = currentroot*2 +2;


        if(left < currlength && arr[left] > arr[currentmax]){

            currentmax = left;
        }

        if(righ < currlength && arr[righ] > arr[currentmax]){
            currentmax = righ;
        }
        if(currentmax != currentroot ){
              int temp = arr[currentmax];
              arr[currentmax]= arr[currentroot];
              arr[currentroot] = temp;
              heapipy(arr,currlength,currentmax);

        }

    }

}
