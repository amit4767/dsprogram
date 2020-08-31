package com.testcompany.ds.day9;

import java.util.Arrays;

public class MainMerge {

    public static void main(String[] args) {
        int [] arr = new int[] {  5 , 23 ,34 ,645 ,2344 ,22 ,32};
        MergeSort mergeSort =  new MergeSort();
        System.out.println(" Merget out put ="+ Arrays.toString(mergeSort.mergSort(arr,0 ,arr.length -1)));

        MergeSortTryMyself mergeSortTryMyself = new MergeSortTryMyself();

        int [] arr1 = new int[] {  5 , 23 ,34 ,645 ,2344 ,22 ,32};
        System.out.println(" Merget out put ="+ Arrays.toString(mergeSortTryMyself.mergersort(arr1,0 ,arr.length -1)));

    }
}
