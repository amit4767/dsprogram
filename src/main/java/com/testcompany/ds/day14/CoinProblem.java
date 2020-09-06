package com.testcompany.ds.day14;

public class CoinProblem {

    //int [] conis = new int[]{ 0,2,3,5,10}; // need to appned zero in the coin array at index 0
    //        CoinProblem coinProblem = new CoinProblem();
    //        System.out.println("Diffrenet number of ways  = "+ coinProblem.totalCount(conis,15));
    public  int totalCount(int[] coins , int sum){
        //First create 2d array
        int [][]sums  = new int[coins.length +1][sum+1];
        //Set value of [0][0] index
        sums[0][0] = 1;
        //Set value of [0][1] index
        sums[0][1] =0;
        //set value for column Zero as 1
        for(int i = 0 ; i < coins.length ; i ++){
            sums[i][0] = 1;
        }
        //Fill first raw as first element in the coins array is 2 at position conis[1] .
        for(int i = 1 ; i < sum ; i ++){
            int x = 0;
            if (i%2 == 0){
                x =1;
            }else {
                x =0;
            }
            sums[1][i] = x;
        }

        // Need to skip i =0 and i = 1 , as they already completed .
        // Need to skip j = 0 . as it already completed.
        for(int i = 2 ; i < coins.length ; i++){
            for(int j = 1 ; j <=sum; j++){
                if(coins[i] > j){
                    sums[i][j] = sums[i-1][j];
                }else {
                    sums[i][j] = sums[i-1][j] + sums[i][j - coins[i]];
                }
            }

        }
        return  sums[coins.length-1][sum];
    }
}
