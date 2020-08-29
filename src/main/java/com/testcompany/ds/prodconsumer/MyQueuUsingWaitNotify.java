package com.testcompany.ds.prodconsumer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.ReentrantLock;

public class MyQueuUsingWaitNotify<E> {

    private Queue<E> queue;
    private  int max = 16 ;
    ReentrantLock reentrantLock  = new ReentrantLock(true);
    public  MyQueuUsingWaitNotify(int size){
        queue = new LinkedList<>();
        max = size;
    }

    public void Add(E e){
        reentrantLock.lock();
        try {
            while (queue.size()  == max){
                synchronized (queue){
                    try {
                        queue.wait();
                    } catch (InterruptedException interruptedException) {
                        interruptedException.printStackTrace();
                    }
                }
            }
            queue.add(e);
            queue.notifyAll();
        }finally {
            reentrantLock.unlock();
        }
    }

    public  E remove(){

        E e = null;
        reentrantLock.lock();
        try {
            synchronized (queue){
                while (queue.size() == 0) {
                    try {
                        queue.wait();
                    } catch (InterruptedException interruptedException) {
                        interruptedException.printStackTrace();
                    }
                }
            }

            e = queue.remove();
            queue.notifyAll();
        }finally {

            reentrantLock.lock();
        }
           return e;
    }
}
