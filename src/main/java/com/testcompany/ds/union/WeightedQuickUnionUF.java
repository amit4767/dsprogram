package com.testcompany.ds.union;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class WeightedQuickUnionUF {

    private  int[] id ;
    private  int[] size;
    private int count = 0;

    public  WeightedQuickUnionUF(int n){

        id = new int[n];
        size = new int[n];
        for(int i= 0 ;i < n ;i ++){
            id[i] = i;
            size[i] = 1;
        }
    }


    public int root(int p){

        while (p != id[p]){

            p = id[p];
        }

        return  p;
    }
    public  boolean connected(int p , int q){
         return  true;
    }

    public int count() {
        return count;
    }

    public void union(int p , int q){

        int proot = root(p);
        int qroot = root(q);
        if(proot == qroot)
            return;

        if(size[proot]  < size[qroot]){

            id[proot] = qroot;

            size[qroot]  = size[qroot] + size[proot];

        }else {

             id[qroot] = proot;
            size[proot]  = size[proot] + size[qroot];


        }

         count --;

    }



    public static void main(String[] args) {

        int n = StdIn.readInt();
        WeightedQuickUnionUF uf = new WeightedQuickUnionUF(n);
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
