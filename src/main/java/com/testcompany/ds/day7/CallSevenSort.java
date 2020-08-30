package com.testcompany.ds.day7;

import java.util.Arrays;

public class CallSevenSort {

    public static void main(String[] args) {
        int[] arr = new int[]{ 100 ,4,5 ,8 ,55 ,78,3 ,9 , 10 ,11 ,12};

        DaySevenSorting daySevenSorting  = new DaySevenSorting();

        System.out.println(" Bubble sort output  = "+ Arrays.toString(daySevenSorting.bubbleSort(arr)));

        System.out.println(" insertion sort output  = "+ Arrays.toString(daySevenSorting.insertSort(arr)));

        System.out.println(" selection sort output  = "+ Arrays.toString(daySevenSorting.selectionSort(arr)));



    }
}
