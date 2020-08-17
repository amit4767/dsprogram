package com.testcompany.ds.day6;

import java.util.concurrent.TimeUnit;

public class RunnableThread {

    public static void main(String[] args) {
        System.out.println(" Hello man method before calling RunnableThread="+Thread.currentThread());
        new MyThread3();
        new MyThread3();
        System.out.println(" Hello man method after calling RunnableThread="+Thread.currentThread());

    }
}

class MyThread3 implements Runnable {

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

    MyThread3(){
        id = ++counter;
        new Thread(this).start();

    }
}
