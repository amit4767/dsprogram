package com.testcompany.ds.day6;

import java.util.concurrent.TimeUnit;

public class SecondThread {

    public static void main(String[] args) {
        System.out.println(" Hello man method before calling Thread method ="+Thread.currentThread());
        new MyThread1().start();
        Thread t2 = new MyThread1();
        t2.start();
        System.out.println("Thread first name  ="+ t2);
        System.out.println(" Hello man method after calling Thread method="+Thread.currentThread());

    }
}

class MyThread1  extends  Thread {

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

    MyThread1(){
        id = ++counter;
        //this.start();
    }
}
