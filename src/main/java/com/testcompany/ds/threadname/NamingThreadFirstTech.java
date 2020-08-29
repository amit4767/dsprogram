package com.testcompany.ds.threadname;

public class NamingThreadFirstTech {

    public static void main(String[] args) {

        String mainThread = Thread.currentThread().getName();
        System.out.println("Main  thread star here = "+mainThread);

        new Thread( new LoopTaskB(),"Woker-1").start();

        Thread t2 = new Thread(new LoopTaskB());
         t2.setName("Worker-2");
        t2.start();

        System.out.println("Main  thread end here  = "+mainThread);
    }

}
