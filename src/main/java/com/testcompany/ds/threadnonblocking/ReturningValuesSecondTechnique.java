package com.testcompany.ds.threadnonblocking;

import com.testcompany.ds.threadreturn.ValueReturnTask;

public class ReturningValuesSecondTechnique {

    public static void main(String[] args) {
        String threadName = Thread.currentThread().getName();
        System.out.println(" [" + threadName  +"]  main thread start here --");
        ValueReturnTaskB task1 = new ValueReturnTaskB(2 ,3,10 ,  new SumObserver("task -1"));
        ValueReturnTaskB task2 = new ValueReturnTaskB(3 ,4,100 , new SumObserver("task -2"));
        ValueReturnTaskB task3 = new ValueReturnTaskB(4 ,5,1000 ,new SumObserver("task -3"));

        Thread t1 = new Thread(task1 ,"Thread-1");
        Thread t2 = new Thread(task2 ,"Thread-1");
        Thread t3 = new Thread(task3 ,"Thread-1");

        t1.start();
        t2.start();
        t3.start();
        System.out.println(" [ "+threadName +"] main thread end");

    }
}
