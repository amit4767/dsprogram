package com.testcompany.ds.union;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class QuickFindUF_One {

    private int[] id ;

    private int count;

    //Set id of each object to self
    public QuickFindUF_One(int size){
        id = new int [size];
        count = size;
        for(int i =0 ; i < size ;i ++)
               id[i] =i;
    }

    public int count() {
        return count;
    }

    private void validate(int p) {
        int n = id.length;
        if (p < 0 || p >= n) {
            throw new IllegalArgumentException("index " + p + " is not between 0 and " + (n-1));
        }
    }


    //check if they connected.
    public  boolean connected(int p , int q){

        validate(p);
        validate(q);
        return id[p] == id[q];
    }

    //
     public  void union(int p , int q){

         validate(p);
         validate(q);
        int pvalue = id[p];
        int qvalue = id[q];

        if(pvalue == qvalue)  return;
          for (int i = 0 ; i < id.length ; i++){
              if(id[i] == pvalue)
                  id[i] = qvalue;
          }

         count--;
     }

    public static void main(String[] args) {

        int n = StdIn.readInt();
        QuickFindUF_One uf = new QuickFindUF_One(n);
        while (!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if (uf.connected(p, q)) continue;
            uf.union(p, q);
            StdOut.println(p + " " + q);
        }
        StdOut.println(uf.count() + " components");

    }
}



//java  -classpath /Users/kumaram/cdkproject/dsprogram/target/classes:/Users/kumaram/Desktop/dataStrcuture/algs4.jar com.cdk.ds.union.QuickFindUF_One < /Users/kumaram/Desktop/dataStrcuture/tinyUF.txt

//java  -classpath /Users/kumaram/cdkproject/dsprogram/target/classes:/Users/kumaram/Desktop/dataStrcuture/algs4.jar com.cdk.ds.union.QuickFindUF < /Users/kumaram/Desktop/dataStrcuture/tinyUF.txt