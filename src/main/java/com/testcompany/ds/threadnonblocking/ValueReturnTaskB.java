package com.testcompany.ds.threadnonblocking;

import java.util.concurrent.TimeUnit;

public class ValueReturnTaskB  implements  Runnable{

    private int a;
    private  int b;
    private  long sleepTime ;
    private int sum;

    private  static  int count = 0 ;
    private  int instanceNumber ;
    private String taskId;

    private  ResultListener<Integer> resultprocessor;

    public  ValueReturnTaskB(int a , int b , long sleepTime , ResultListener<Integer>  resultprocessor){
        this.a = a;
        this.b = b;
        this.sleepTime = sleepTime;
        this.instanceNumber = ++count;
        this.taskId = "ValueReturnTakB " + instanceNumber;
        this.resultprocessor = resultprocessor;
    }


    /**
     * When an object implementing interface {@code Runnable} is used
     * to create a thread, starting the thread causes the object's
     * {@code run} method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method {@code run} is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {

        String curretThreadName = Thread.currentThread().getName();

        System.out.println("####   ["+curretThreadName +"] < "+ taskId+ "> STARTING ####");

        try {
            TimeUnit.MILLISECONDS.sleep(sleepTime);
        }catch (InterruptedException e){
             e.printStackTrace();
        }
        sum = a+b;

        System.out.println("####   ["+curretThreadName +"] < "+ taskId+ "> COMPLETED ####");
        resultprocessor.notifyResult(sum);

    }
}
