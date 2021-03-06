package com.testcompany.ds.threadname;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class NamingThreadFirstTech {

    public static void main(String[] args) {

        String mainThread = Thread.currentThread().getName();
        System.out.println("Main  thread star here = "+mainThread);

//        new Thread( new LoopTaskB(),"Woker-1").start();
//
//        Thread t2 = new Thread(new LoopTaskB());
//        // t2.setName("Worker-2");
//        t2.start();
//
//        try {
//            TimeUnit.MILLISECONDS.sleep(800);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        ExecutorService executorService  = Executors.newCachedThreadPool( new NamedThreadFactory());

        for(int i= 0;i < 3 ;i++){

            executorService.execute(new LoopTaskB());
        }

        System.out.println("Main  thread half way here  = "+mainThread);

//        t2.setName("Woker-2");
//
//        System.out.println("["+mainThread+ "] Main thread end here ........");

    }

}
