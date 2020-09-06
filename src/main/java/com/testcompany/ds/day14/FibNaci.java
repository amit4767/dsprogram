package com.testcompany.ds.day14;

public class FibNaci {

    public   int fib(int n ){
         if(n <=1){
             return  n;
         }
        return fib(n-1) + fib(n-2);

    }
}
