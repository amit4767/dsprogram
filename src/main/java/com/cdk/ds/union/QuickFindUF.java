package com.cdk.ds.union;

public class QuickFindUF {


    private int[] id ;


    //Set id of each object to self
    public QuickFindUF(int size){
        id = new int [size];
        for(int i =0 ; i < size ;i ++)
               id[i] =i;
    }


    //check if they connected.

    public  boolean connected(int p , int q){
        return id[p] == id[q];
    }


    //
     public  void Union(int p , int q){

     }

    public static void main(String[] args) {

        QuickFindUF quickFindUF = new QuickFindUF(10);

    }
}
