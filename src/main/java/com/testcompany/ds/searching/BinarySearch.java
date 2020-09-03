package com.testcompany.ds.searching;

public class BinarySearch {

    public  int binSearch( int [] arr , int totalSize , int finder){

        int left = 0 ;
        int righ = totalSize-1;

        while(left < righ){
            int mid = (left + righ)/2;
            if(arr[mid] == finder){
                return  mid;
            }
            else if( finder > arr[mid]){
                left = mid +1;
            }else if (finder < arr[mid]){
                righ = mid -1;
            }
        }


        return  -1;
    }
}
