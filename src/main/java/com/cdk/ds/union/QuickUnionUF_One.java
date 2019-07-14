package com.cdk.ds.union;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class QuickUnionUF_One {

    private  int[] parent;
    private byte[] rank;
    private int count;

    // Set id of each object to it self.
    public QuickUnionUF_One(int n){
        parent = new int[n];
        rank = new byte[n];
        for(int i =0; i < n ; i++){
            parent[i] = i;
            rank[i] = 0;
        }
    }

    private void validate(int p) {
        int n = parent.length;
        if (p < 0 || p >= n) {
            throw new IllegalArgumentException("index " + p + " is not between 0 and " + (n-1));
        }
    }

    public int count() {
        return count;
    }
    //Chase parent pointers until reach the root
    private int root(int i){
        while(i != parent[i]) i = parent[i];
        return  i;
    }


    // check if p and q has same root
    public  boolean connected(int p , int q){

        return  root(p) == root(q);
    }

    public void  union(int p , int q){
        int rootP = root(p);
        int rootQ = root(p);
        if(rootP== rootQ)
            return;

        parent[rootP] =rootQ;
        count--;

    }
    public static void main(String[] args) {
        int n = StdIn.readInt();
        QuickUnionUF_One uf = new QuickUnionUF_One(n);
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
