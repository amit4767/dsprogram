package com.testcompany.ds.threadname;

import java.util.concurrent.TimeUnit;

import static java.lang.Math.*;

public class LoopTaskB implements  Runnable {

    private static int count = 0;
    private  int instanceNumber = 0;
    private String taskId;

    @Override
    public  void  run(){

        Thread.currentThread().setName(" Worker - "+ instanceNumber);
        String currentThreadName =  Thread.currentThread().getName();
        System.out.println("Start of Thread [ "+currentThreadName+" ] having task id ="+ instanceNumber);

        for (int i = 10 ;i >0 ;i--){
            System.out.println("< "+ instanceNumber +"> TICK TICK -"+i+ " [ "+ currentThreadName + " ]");

            try {
                TimeUnit.MILLISECONDS.sleep((long)(random()*1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
        System.out.println("end of Thread [ "+currentThreadName+" ] having task id ="+ instanceNumber);
    }

    public  LoopTaskB(){

        this.instanceNumber = ++count;
        this.taskId = "LoopTask Id"+ instanceNumber;
    }

}
