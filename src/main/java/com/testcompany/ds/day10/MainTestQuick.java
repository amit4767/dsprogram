package com.testcompany.ds.day10;

import java.util.Arrays;

public class MainTestQuick {

    public static void main(String[] args) {

        int [] arr = new int [] {3 ,4 ,33,3323 ,32 ,2 ,2 ,3 ,4};

        QuikSort quikSort = new QuikSort();
        System.out.println(" quick sort output = "+ Arrays.toString (quikSort.quickSort(arr,0 ,arr.length -1)));

    }



}
