package com.learn.generic.chapter1502;

/**
 * @author zhangfb
 */
public class Holder3<T> {

    private T a;

    public Holder3(T a) {
        this.a = a;
    }

    public void set(T a) {
        this.a = a;
    }

    public T get() {
        return a;
    }
}
