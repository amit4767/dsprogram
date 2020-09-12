package com.testcompany.ds.threadnonblocking;

public interface ResultListener<T> {

  void notifyResult(T result);
}
