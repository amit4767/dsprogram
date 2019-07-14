package com.cdk.ds.union;

public class BinarySearchCounter {


    static int recursiveRotation(int arr[], int low ,int high){

        if(high < low) return  -1;
        if(arr[low] <= arr[high])
             return  low;
        int mid = low + (high - low)/2;
        int next =  (mid +1)% arr.length;
        int previous  = (mid + arr.length -1) % arr.length;

        if(arr[mid] <= arr[next]  && arr[mid] <= arr[previous])
             return  mid;
         if(arr[mid] <= arr[high])
                  return  recursiveRotation(arr,low,mid -1);

          else return recursiveRotation(arr,mid +1,high);
    }

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

        System.out.println(countRotations(arr));
        System.out.println(recursiveRotation(arr,0,arr.length -1));
    }
}
