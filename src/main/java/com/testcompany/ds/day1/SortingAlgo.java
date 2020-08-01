package com.testcompany.ds.day1;

public class SortingAlgo {

    public static void main(String[] args) {
        System.out.println("Need to checking Sorting Algo");
      //  BubbleAlgo bubbleAlgo =  new BubbleAlgo();
        int [] input = new int[]{16,15,6,8,5,1,9};
//      //  int [] output = bubbleAlgo.SortArray(input);
//        for ( int i : output){
//            System.out.println(" array out ="+i);
//        }

        InsertSort insertSort = new InsertSort();

        int [] output = insertSort.sortArray(input);
        for ( int i : output){
            System.out.println(" array out ="+i);
        }

    }
}
