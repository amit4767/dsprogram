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

     public  int [] heapSort(int [] arr){

         int len = arr.length;
        //find big number
        for(int i = len/2 - 1; i>=0  ; i --){
            hipfiy(arr,len,i);
        }

        //Delete
         for(int n = arr.length -1 ;  n > 0 ; n--){

               int temp = arr[n];
               arr[n]  = arr[0];
               arr[0] = temp;

             hipfiy(arr,n,0);
         }
        return  arr;
     }

    void heapify(int arr[], int n, int i)
    {
        int largest = i; // Initialize largest as root
        int l = 2*i + 1; // left = 2*i + 1
        int r = 2*i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (l < n && arr[l] > arr[largest])
            largest = l;

        // If right child is larger than largest so far
        if (r < n && arr[r] > arr[largest])
            largest = r;

        // If largest is not root
        if (largest != i)
        {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }

    private  void hipfiy(int [] arr ,int n , int i ){

         int largest = i;
        int l = i *2 +1 ;
          int r = i*2 +2;

        // If left child is larger than root
        if (l < n && arr[l] > arr[largest])
            largest = l;

        // If right child is larger than largest so far
        if (r < n && arr[r] > arr[largest])
            largest = r;

//        if(  l < n && l > arr[largest]){
//            largest = l;
//        }
//          if(r < n && r > arr[largest]){
//
//              largest = r;
//          }

          //
         // If largest is not root
                if (largest != i)
                {
                    int swap = arr[i];
                    arr[i] = arr[largest];
                    arr[largest] = swap;

                    // Recursively heapify the affected sub-tree
                    hipfiy(arr, n, largest);
                }

//          if(largest != i ){
//
//              int temp = arr[largest];
//              arr[largest] = arr[i];
//              arr[i] = temp;
//
//              hipfiy(arr,n ,largest);
//          }

     }
}
