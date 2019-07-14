package com.cdk.ds.union;

public class BinarySearchCounter {

    static int countRotations(int arr[])
    {
        int low  = 0;
        int high = arr.length  -1 ;
        int n = arr.length;
        while(low <= high){


     if(arr[low] <= arr[high]) // case 1
                  return  low;

            int mid  = low + (high - low)/2;
            int next = (mid +1) % n;
            int previous  = (mid + n -1 )%n;
            if( arr[mid] <= arr[next] && arr[mid] <= arr[previous])  // case 2;
                 return  mid;

             if( arr[low] <= arr[high]){
                  high = mid -1;
             }else {
                 low = mid +1;
             }

        }
        return  -1;
    }

    // Driver program to test above functions
    public static void main (String[] args)


    {

        int y[] ={11,12,15,18,2,5,6,8} ;
        int x[] = {15,22,23,28,31,38,78,5,6,8,10,12};
        int A[]={16,15,14,13,12,11,10,8,7,6,3,2};
        int arr1[] = {15, 18, 2, 3, 6, 12};


        int arr[] = {15, 18, 2, 3, 6, 12};
        int n = arr.length;

        System.out.println(countRotations(y));
    }
}
