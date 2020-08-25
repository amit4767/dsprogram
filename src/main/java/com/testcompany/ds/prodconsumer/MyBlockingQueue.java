package com.testcompany.ds.prodconsumer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MyBlockingQueue<E> {

    public  Queue<E> queue;
    public  int max  = 16 ;
    private  ReentrantLock lock =  new ReentrantLock(true);
    private Condition notEmpty = lock.newCondition();
    private  Condition notFull = lock.newCondition();
    public  MyBlockingQueue(int size){
        queue = new LinkedList<>() ;
        this.max = size;
    }
    public  void put(E e) throws InterruptedException {
        lock.lock();
        if(max == queue.size()){
            notEmpty.wait();
        }
        queue.add(e);
        notEmpty.signalAll();
        lock.unlock();
    }
    public  E get(){
        lock.lock();
        try {
            while (queue.size() == 0){
                notEmpty.wait();
            }
            E e  = queue.remove();
              notFull.signalAll();
            return e;
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
         return  null;

    }
}
