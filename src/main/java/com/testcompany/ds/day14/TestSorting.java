package com.testcompany.ds.day14;

public class TestSorting {

    public static void main(String[] args) {

        FibNaci fibNaci  = new FibNaci(8);

        System.out.println("Fibnaci  - "+fibNaci.fib(8));

        System.out.println("fibNaci.fibBottomUpAppoarch   ="+fibNaci.fibBottomUpAppoarch(8));

        int [] conis = new int[]{ 0,2,3,5,10};
        CoinProblem coinProblem = new CoinProblem();
        System.out.println("Diffrenet number of ways  = "+ coinProblem.totalCount(conis,15));


    }
}
