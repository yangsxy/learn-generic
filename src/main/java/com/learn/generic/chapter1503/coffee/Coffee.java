package com.learn.generic.chapter1503.coffee;

/**
 * @author zhangfb
 */
public class Coffee {

    private static long counter = 0;
    protected final long id = counter++;

    @Override
    public String toString() {
        return "Coffee{" +
                "id=" + id +
                '}';
    }
}
