package com.testcompany.ds.union;

public class FibonacciClass {

    int lookup[];

     public FibonacciClass(){

     }

     public  FibonacciClass(int n ){
         lookup = new int[n +1];
         for (int i=0 ; i <= n ; i++)
               lookup[i] =-1;
     }

    public  int fibMem(int n){
         if(lookup[n]  == -1){
             if(n <= 1)
                 lookup[n] =n;
             else
           lookup[n] = fibMem(n-1) + fibMem(n-2);

         }
             return  lookup[n];
    }
    public  int fib(int n){
        if(n<=1)
            return  n;
        return  fib(n-1) +fib(n-2);

    }
    public static void main(String[] args) {
        System.out.println("Hello Fibonacci");
        FibonacciClass fc = new FibonacciClass();
        System.out.println(fc.fib(8));
        FibonacciClass fc2 = new FibonacciClass(8);
        System.out.println( fc2.fibMem(8));
    }

}
