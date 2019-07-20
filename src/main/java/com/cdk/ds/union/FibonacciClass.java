package com.cdk.ds.union;

public class FibonacciClass {


    public  int fib(int n){

        if(n<=1)
            return  n;
        return  fib(n-1) +fib(n-2);

    }
    public static void main(String[] args) {

        System.out.println("Hello Fibonacci");

        FibonacciClass fc = new FibonacciClass();
        System.out.println(fc.fib(7));


    }


}
