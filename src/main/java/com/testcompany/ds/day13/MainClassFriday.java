package com.testcompany.ds.day13;

import java.util.Arrays;

public class MainClassFriday {

    public static void main(String[] args) {
        int [] arr  = new int[]{7,6,10,5,9 ,2 ,1 ,15 ,7};

        ThreeSort threeSort = new ThreeSort();
        System.out.println(" Merge sorting  === "+ Arrays.toString(threeSort.mergeSort(arr,0 ,arr.length -1)));

        int [] arr1  = new int[]{7,6,10,5,9 ,2 ,1 ,15 ,7};
        System.out.println(" Quick sorting  === "+ Arrays.toString(threeSort.quickSort(arr1,0 ,arr.length -1)));

        int [] arr3  = new int[]{7,6,10,5,9 ,2 ,1 ,15 ,7};
        System.out.println(" Quick sorting  === "+ Arrays.toString(threeSort.heapSort(arr3)));

    }
}
