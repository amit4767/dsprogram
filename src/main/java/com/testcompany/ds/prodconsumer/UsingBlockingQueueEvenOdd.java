package com.testcompany.ds.prodconsumer;

import java.util.concurrent.ArrayBlockingQueue;


public class UsingBlockingQueueEvenOdd {


    public static void main(String[] args) throws InterruptedException {

        UsingBlockingQueueEvenOdd usingBlockingQueueEvenOdd = new UsingBlockingQueueEvenOdd();
        ArrayBlockingQueue<Long> blockingDeque = new ArrayBlockingQueue<Long>(10);
        final Runnable producer = () ->{

            for(int i =0 ; i < 10 ; i++){
                try {

                    if( i % 2 == 0){
                        System.out.println("number = "+i);
                        usingBlockingQueueEvenOdd.wait();
                    }


                    usingBlockingQueueEvenOdd.notify();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

                    System.out.println("I am adding");

        };
         new Thread(producer).start();
        // new Thread(producer).start();
        final Runnable consumer = () ->{
            for(int i =0 ; i < 10 ; i++){
                try {
                    if(i %2  !=0){
                        System.out.println("number = "+i);
                        usingBlockingQueueEvenOdd.wait();
                    }

                    usingBlockingQueueEvenOdd.notify();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        };
        new Thread(consumer).start();
      //  new Thread(consumer).start();
        Thread.sleep(1000);

    }
}
