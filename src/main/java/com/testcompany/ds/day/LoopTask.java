package com.testcompany.ds.day;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class LoopTask  implements  Runnable {

    public static  int counter = 0;
    public int localcount = 0;
    @Override
    public  void  run(){

        //Thread.currentThread().getName()
        System.out.println("Started the child thread for task Id ="+localcount+" name "+Thread.currentThread().getName());
        for(int i  = 0 ; i < 10 ; i ++){

            System.out.println("this is loop for ="+localcount +" is  ="+i);

            try {
                TimeUnit.MILLISECONDS.sleep((long) (Math.random()*1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(" End of the thread the child thread");

    }
    public  LoopTask(){
        this.localcount = ++counter;
        // new Thread().start();
    }

}
