package com.testcompany.ds.day6;

import java.util.concurrent.TimeUnit;

public class RunnableThreadThread {

    public static void main(String[] args) {
        System.out.println(" Hello man method before calling RunnableThreadThread="+Thread.currentThread());

        Thread t =  new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0  ; i < 10  ; i++){
                    try {
                        System.out.println("Helloo =="+i);
                        TimeUnit.MILLISECONDS.sleep(250);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        t.start();

        System.out.println(" Hello man method after calling RunnableThreadTwo="+Thread.currentThread());

    }
}
