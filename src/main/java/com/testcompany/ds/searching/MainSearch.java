package com.testcompany.ds.searching;

public class MainSearch {

    public static void main(String[] args) {

        int [] arr = new int[]{1, 2, 5, 6, 7, 7, 9, 10, 15};
        BinarySearch binarySearch = new BinarySearch();

        System.out.println("find the element  ="+ binarySearch.binSearch(arr,arr.length,9));

    }
}
