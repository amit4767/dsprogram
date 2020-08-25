package com.testcompany.ds.prodconsumer;

import java.util.concurrent.ArrayBlockingQueue;


public class UsingBlockingQueue {

    public static void main(String[] args) throws InterruptedException {

        ArrayBlockingQueue<Long> blockingDeque = new ArrayBlockingQueue<Long>(10);
        final Runnable producer = () ->{
            while(true){
                if(blockingDeque.size() < 10){
                    System.out.println("I am adding");
                    blockingDeque.add( Math.round(Math.random()));
                }
            }
        };
         new Thread(producer).start();
         new Thread(producer).start();
        final Runnable consumer = () ->{
            while (true){
                try {
                    System.out.println("I am eating" +blockingDeque.take());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        new Thread(consumer).start();
        new Thread(consumer).start();
        Thread.sleep(1000);

    }
}
