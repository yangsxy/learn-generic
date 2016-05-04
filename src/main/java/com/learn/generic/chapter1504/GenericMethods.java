package com.learn.generic.chapter1504;

/**
 * @author zhangfb
 */
public class GenericMethods {

    public <T> void f(T x) {
        System.out.println(x.getClass().getName());
    }
}
