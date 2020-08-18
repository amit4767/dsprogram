package com.testcompany.ds.day;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPool {

    public static void main(String[] args) {
        System.out.println("START of main thread ");

        // Fixed
//        ExecutorService executorService = Executors.newFixedThreadPool(3);
//        for(int i =0 ; i < 6 ;i++){
//
//            executorService.execute(new LoopTask());
//        }

        //Cache Thread pool
        ExecutorService executorService1 = Executors.newCachedThreadPool();
        for(int i =0 ; i < 6 ;i++){
            executorService1.execute(new LoopTask());
        }



        executorService1.shutdown();
        System.out.println("END of main thread ");
    }
}
