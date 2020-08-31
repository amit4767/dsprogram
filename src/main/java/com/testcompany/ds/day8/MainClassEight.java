package com.testcompany.ds.day8;

import java.util.Arrays;

public class MainClassEight {

    public static void main(String[] args) {

        int [] arr = new int []{ 5 , 3 ,5 ,3 ,20 ,32 ,04 ,4334};
        SortClassEight sortClassEight = new SortClassEight();

        System.out.println("Bubble Sorting = "+ Arrays.toString(sortClassEight.bubbleSort(arr)));

        int [] arr1 = new int []{ 5 , 3 ,5 ,3 ,20 ,32 ,04 ,4334};
        System.out.println("Bubble Sorting = "+ Arrays.toString(sortClassEight.insertionSort(arr1)));

    }
}
