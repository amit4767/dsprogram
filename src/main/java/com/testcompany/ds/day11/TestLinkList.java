package com.testcompany.ds.day11;

public class TestLinkList {

    public static void main(String[] args) {


        for(int i = 0 ; i < 10 ; i ++){

             Node  node = new Node();

              node.setData(1);
              node.setNode(node);

        }

    }
}
