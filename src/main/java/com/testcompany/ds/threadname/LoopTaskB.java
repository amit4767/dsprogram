package com.testcompany.ds.threadname;

import java.util.concurrent.TimeUnit;

import static java.lang.Math.*;

public class LoopTaskB implements  Runnable {

    private static int count = 0;
    private  int id = 0;
    private String taskId;

    @Override
    public  void  run(){

        Thread.currentThread().setName(" Worker - "+id);
        String currentThreadName =  Thread.currentThread().getName();
        System.out.println("Start of Thread [ "+currentThreadName+" ] having task id ="+id);

        for (int i = 10 ;i >0 ;i--){
            System.out.println("< "+id+"> TICK TICK -"+i+ " [ "+ currentThreadName + " ]");

            try {
                TimeUnit.MILLISECONDS.sleep((long)(random()*1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
        System.out.println("end of Thread [ "+currentThreadName+" ] having task id ="+id);
    }

    public  LoopTaskB(){

        this.id = ++count;
        this.taskId = "LoopTask Id"+id;
    }

}
