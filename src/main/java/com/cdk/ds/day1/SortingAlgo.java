package com.cdk.ds.day1;

public class SortingAlgo {


    public static void main(String[] args) {
        System.out.println("Need to checking Sorting Algo");
        BubbleAlgo bubbleAlgo =  new BubbleAlgo();

        int [] input = new int[]{15,16,6,8,5};

        int [] output = bubbleAlgo.SortArray(input);

        for ( int i : output){

            System.out.println(" array out ="+i);
        }

        System.out.println(" out of array ="+output);
    }
}
