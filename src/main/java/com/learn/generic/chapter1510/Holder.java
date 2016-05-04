package com.learn.generic.chapter1510;

/**
 * @author zhangfb
 */
public class Holder<T> {

    private T item;

    public Holder() {
    }

    public void set(T item) {
        this.item = item;
    }

    public T get() {
        return item;
    }
}
