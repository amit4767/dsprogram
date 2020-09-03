package com.testcompany.ds.day3;



public class SortingAlgoDays3 {

    public static void main(String[] args) {
        System.out.println("Need to checking Sorting Algo");


        int [] input = new int[]{16,15,6,8,5,1,9};


        AllSorting allSorting = new AllSorting();

        int [] output = allSorting.bubbleSort(input);
        System.out.println(" Bubble ");
        for ( int i : output){

            System.out.println(" bubble array out ="+i);
        }


        int [] output2 = allSorting.insertionSort(input);
        System.out.println(" INSERT ");
        for ( int i : output2){

            System.out.println(" insert array out ="+i);
        }

        int [] input2 = new int[]{16,15,6,8,5,1,9};
        int [] output3 = allSorting.selectionSort(input2);
        System.out.println("  Selection ");
        for ( int i : output3){

            System.out.println(" insert array out ="+i);
        }



    }
}
