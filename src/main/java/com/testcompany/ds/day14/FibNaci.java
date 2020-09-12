package com.testcompany.ds.day14;

public class FibNaci {

    public   static int coutner = 0 ;
    private  int [] arr = null;

    public   int fib(int n ){

        if(arr[n]  == -1) {
            coutner++;
            if (n <= 1) {
                return n;
            }
            int sum = fib(n - 1) + fib(n - 2);
            arr[n]  = sum;

            return sum;
        }else {

            return  arr[n];
        }


    }

    public  int fibBottomUpAppoarch(int n ){

        int [] arr = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;

        for(int i = 2 ; i <= n ; i ++){

             arr[i] = arr[i-1] +arr[i-2];
        }
        return arr[n];

    }

    public  FibNaci(int n){

        arr = new int[n+2];

        for(int i = 0 ;i < n+2; i++){
            arr[i]  = -1;
        }

    }
}
