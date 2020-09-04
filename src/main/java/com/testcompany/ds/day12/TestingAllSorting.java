package com.testcompany.ds.day12;

import java.util.Arrays;

public class TestingAllSorting {

    public static void main(String[] args) {
        int [] arr  = new int[]{7,6,10,5,9 ,2 ,1 ,15 ,7};

        System.out.println("bubble Sort    ="+ Arrays.toString(new AllSorting().bubbleSort(arr)));

        int [] arr11  = new int[]{7,6,10,5,9 ,2 ,1 ,15 ,7};
        System.out.println("bubble Sort    ="+ Arrays.toString(new AllSortingTwo().bubbleSort(arr11)));

        int [] arr2  = new int[]{7,6,10,5,9 ,2 ,1 ,15 ,7};

        System.out.println("insert Sort    ="+ Arrays.toString(new AllSorting().insertSort(arr2)));

        int [] arr22  = new int[]{7,6,10,5,9 ,2 ,1 ,15 ,7};

        System.out.println("insert Sort    ="+ Arrays.toString(new AllSortingTwo().insertSort(arr22)));

        int [] arr3  = new int[]{7,6,10,5,9 ,2 ,1 ,15 ,7};

        System.out.println("selection Sort ="+ Arrays.toString(new AllSorting().selection(arr3)));

        int [] arr33  = new int[]{7,6,10,5,9 ,2 ,1 ,15 ,7};

        System.out.println("selection Sort ="+ Arrays.toString(new AllSortingTwo().selectionSort(arr33)));

        int [] arr4  = new int[]{7,6,10,5,9 ,2 ,1 ,15 ,7};

        System.out.println("merge Sort     ="+ Arrays.toString(new AllSorting().mergeSort(arr4,0,arr4.length -1)));


        int [] arr44  = new int[]{7,6,10,5,9 ,2 ,1 ,15 ,7};

        System.out.println("merge Sort     ="+ Arrays.toString(new AllSortingTwo().mergSort(arr4,0,arr4.length -1)));

        int [] arr5  = new int[]{7,6,10,5,9 ,2 ,1 ,15 ,7};

        System.out.println("quick Sort     ="+ Arrays.toString(new AllSorting().quickSort(arr5,0,arr4.length -1)));

        int [] arr55  = new int[]{7,6,10,5,9 ,2 ,1 ,15 ,7};

        System.out.println("quick Sort     ="+ Arrays.toString(new AllSortingTwo().QuickSort(arr5,0,arr4.length -1)));

        int [] arr6 = new int[]{7,6,10,5,9 ,2 ,1 ,15 ,7};

        System.out.println("heap Sort      ="+ Arrays.toString(new AllSorting().heapSort(arr6)));

        int [] arr66 = new int[]{7,6,10,5,9 ,2 ,1 ,15 ,7};

        System.out.println("heap Sort      ="+ Arrays.toString(new AllSortingTwo().HeapSort(arr66)));


    }
}
