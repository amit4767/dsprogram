package com.testcompany.ds.threadname;

public class NamingThreadFirstTech {

    public static void main(String[] args) {

        String mainthreadname = Thread.currentThread().getName();
        System.out.println("Main  thread star here = "+mainthreadname);

        new Thread( new LoopTaskB()).start();

        Thread t2 = new Thread(new LoopTaskB());
        t2.start();

        System.out.println("Main  thread end here  = "+mainthreadname);
    }

}
