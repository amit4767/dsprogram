package com.testcompany.ds.threadreturn;

public class ReturnValueFromThread {
    public static void main(String[] args) {

        String mainthread = Thread.currentThread().getName();

        System.out.println(" [ "+mainthread +" ]  main thread start here");

       ValueReturnTask tas1 = new ValueReturnTask(2 ,3,3000);

       Thread t1  = new Thread(tas1 , "Thread -1");
        ValueReturnTask tas2 = new ValueReturnTask(3 ,4,3000);

        Thread t2  = new Thread(tas2 , "Thread -2");
        ValueReturnTask tas3 = new ValueReturnTask(5 ,6,3000);

        Thread t3  = new Thread(tas3 , "Thread -3");

        t1.start();
        t2.start();
        t3.start();

        try {
            System.out.println(" Result 1  ="+tas1.getSum());
            System.out.println(" Result 2  ="+tas2.getSum());
            System.out.println(" Result 3  ="+tas3.getSum());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println(" [ "+mainthread +" ]  main thread end here");
    }
}
