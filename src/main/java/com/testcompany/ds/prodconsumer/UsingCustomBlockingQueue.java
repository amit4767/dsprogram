package com.testcompany.ds.prodconsumer;



public class UsingCustomBlockingQueue {

    public static void main(String[] args) throws InterruptedException {

        MyQueuUsingWaitNotify<Long> blockingDeque = new MyQueuUsingWaitNotify<Long>(10);
        final Runnable producer = () ->{
            while(true){

                    System.out.println("I am adding");
                    blockingDeque.Add( Math.round(Math.random()));

            }
        };
         new Thread(producer).start();
        // new Thread(producer).start();
        final Runnable consumer = () ->{
            while (true){
                try {
                    System.out.println("I am eating" +blockingDeque.remove());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        new Thread(consumer).start();
       // new Thread(consumer).start();
        Thread.sleep(100);

    }
}
