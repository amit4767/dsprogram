package com.testcompany.ds.union;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

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
     public  void union(int p , int q){
        int pvalue = id[p];
        int qvalue = id[q];
          for (int i = 0 ; i < id.length ; i++){
              if(id[i] == pvalue)
                  id[i] = qvalue;
          }
     }

    public static void main(String[] args) {



    }
}




//java  -classpath /Users/kumaram/cdkproject/dsprogram/target/classes:/Users/kumaram/Desktop/dataStrcuture/algs4.jar com.cdk.ds.union.QuickFindUF < /Users/kumaram/Desktop/dataStrcuture/tinyUF.txt