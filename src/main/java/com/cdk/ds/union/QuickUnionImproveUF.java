package com.cdk.ds.union;

public class QuickUnionImproveUF {

    private  int[] id;
    private  int[] size;

  // Set id of each object to it self.
    public QuickUnionImproveUF(int n){
        id = new int[n];
        for(int i =0; i < n ; i++){
            id[i] = i;
            size[i] =0;
        }
    }

    //Chase parent pointers until reach the root
    private int root(int i){
        while(i != id[i]) i = id[i];
        return  i;
    }


    // check if p and q has same root
    public  boolean connected(int p , int q){

        return  root(p) == root(q);
    }


    public void  union(int p , int q){

        int i = root(p);
        int j = root(p);

        id[i] =j;

    }
    public static void main(String[] args) {


    }
}
