package com.testcompany.ds.threadreturn;

import java.util.concurrent.TimeUnit;

public class ValueReturnTask  implements  Runnable{

    private  int a;
    private  int b;
    private  long sleepTime;
    private  int sum;

    private static  int count = 0;
    private int instanceNumber;
    private  String taskId;

    private  volatile  boolean done = false;
    public  ValueReturnTask(int a , int b , long sleepTime){
        this.a =a;
        this.b = b;
        this.sleepTime = sleepTime;
        this.instanceNumber = ++count;
        this.taskId = "ValueReturnTask A -"+instanceNumber;

    }
    @Override
    public void run() {

       String currentThreadName = Thread.currentThread().getName();
        System.out.println("###  ["+currentThreadName +" ] <" +taskId +"> STARTING ######");

        try {
            TimeUnit.MILLISECONDS.sleep(sleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        sum = a+b;
        done = true;
        synchronized (this){
            System.out.println("THREAD SUM Notification DONE");
            this.notify();
        }

        System.out.println("###  ["+currentThreadName +" ] <" +taskId +"> COMPLETED ######");
    }

     public int getSum() throws InterruptedException {
        synchronized (this){
            if( ! done){
                System.out.println("THREAD IS WAITNG FOR SUM TO COMPLETE");
                this.wait();
            }
        }
        return sum;
     }

}
