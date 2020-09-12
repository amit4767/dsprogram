package com.testcompany.ds.day17;

import java.util.Arrays;

public class TestMainSorting {

    public static void main(String[] args) {
        int [] arr  = new int[]{7,6,10,5,9 ,2 ,1 ,15 ,7};
        SortingClass  sortingClass =  new SortingClass();
        System.out.println(" Merge sorting  === "+ Arrays.toString(sortingClass.mergeSort(arr,0 ,arr.length -1)));

        int [] arr2  = new int[]{7,6,10,5,9 ,2 ,1 ,15 ,7};
        System.out.println(" quick sorting  === "+ Arrays.toString(sortingClass.quickSort(arr2,0 ,arr.length -1)));

        int [] arr3  = new int[]{7,6,10,5,9 ,2 ,1 ,15 ,7};
        System.out.println(" heap sport sorting  == "+ Arrays.toString(sortingClass.heapSort(arr3)));

    }
}
