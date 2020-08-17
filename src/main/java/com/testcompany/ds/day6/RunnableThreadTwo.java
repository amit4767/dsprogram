package com.testcompany.ds.day6;

import java.util.concurrent.TimeUnit;

public class RunnableThreadTwo {

    public static void main(String[] args) {
        System.out.println(" Hello man method before calling RunnableThreadTwo="+Thread.currentThread());

        new Thread( new MyThread4()).start();
         Thread t1  =  new Thread(new MyThread4());
         t1.start();
        System.out.println(" Hello man method after calling RunnableThreadTwo="+Thread.currentThread());

    }
}

class MyThread4 implements Runnable {

    public  static  int counter  =0;
    public  int id =0;

    @Override
     public  void  run(){

        for(int i = 0  ; i < 10  ; i++){

            System.out.println("Print number using id ="+id +" ="+i);
            try {
                TimeUnit.MILLISECONDS.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    MyThread4(){
        id = ++counter;
      //  new Thread(this).start();

    }
}
