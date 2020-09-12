package com.testcompany.ds.day17;

public class SortingClass {

    public  int [] mergeSort(int [] arr , int low , int high){

        if(low < high){
            int mid = (low + high)/2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid+1, high);
            merge(arr,low , mid,high);

        }
        return  arr;
    }

    private  void merge (int [] arr , int low ,int mid , int high){

          int [] temparr = new int[arr.length];
          int i = low;
          int k = low;
          int j = mid +1 ;

          while( i <= mid && j <= high){
               if(arr[i] <= arr[j]){
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

                while (i <= mid){
                    temparr[k]   = arr[i];
                    i++;
                    k++;
                }
          }

          for(k = low ; k<= high ; k++){
              arr[k]  = temparr[k];
          }
    }

    public  int [] quickSort(int [] arr , int low , int high){
        if(low < high){
            int  mid = quick(arr, low ,high);
            quickSort( arr , low , mid -1);
            quickSort( arr , mid +1 , high);

        }
        return  arr;
    }
    private  int quick( int []arr , int low , int high){
        int start = low;
        int end = high;
        int pivot =  low;
        while(start <= end){
             if(arr[start] <= arr[pivot]){
                 start ++;
             }else if (arr[end] >arr[pivot]){
                    end --;
             }
            if (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
        }
        int temp = arr[pivot];
        arr[pivot] = arr[end];
        arr[end] = temp;
        return end;
    }

    public  int [] heapSort( int [] arr){

        int len = arr.length;
        for(int i = len/2 -1 ; i >=0 ; i --){
             heapify(arr , len ,i);
        }

        for(int n = len-1 ; n > 0 ; n --){
            int temp = arr[n];
            arr[n] = arr[0];
            arr[0] = temp;
            heapify(arr , n,0);
        }

        return  arr;
    }

    private  void heapify(int [] arr, int len , int root ){

        int maxIndex = root ;
        int leftchild = 2*root +1;
        int righchild = 2*root +2;
        int maxValue = arr[maxIndex];

        if(leftchild < len &&  arr[leftchild] > arr[maxIndex] ){
                maxIndex = leftchild;
        }

        if(righchild  < len && arr[righchild] > arr[maxIndex]){
            maxIndex = righchild;
        }

        if(maxIndex != root){
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[root];
            arr[root] =  temp;
            heapify(arr, len ,maxIndex);
        }

    }
}
