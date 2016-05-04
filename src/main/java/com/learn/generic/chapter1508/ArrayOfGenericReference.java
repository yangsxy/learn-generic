package com.learn.generic.chapter1508;

/**
 * @author zhangfb
 */
public class ArrayOfGenericReference {

    static final int SIZE = 100;
    static Generic<Integer>[] gia;

    public static void main(String[] args) {
        gia = (Generic<Integer>[]) new Object[SIZE];
        //gia = (Generic<Integer>[]) new Generic[SIZE];
    }
}
