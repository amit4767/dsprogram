package com.testcompany.ds.threadnonblocking;

import edu.princeton.cs.algs4.StdOut;

public class SumObserver  implements  ResultListener<Integer>{

    private String taskId;
    public SumObserver(String task){
        this.taskId = task;
    }

    @Override
    public void notifyResult(Integer result) {

        System.out.println(" Result for  "+taskId +" = "+result);

    }
}
