package com.learn.generic.chapter1504;

/**
 * @author zhangfb
 */
public class CountedObject {

    private static int counter = 0;
    private int count = counter++;

    @Override
    public String toString() {
        return "CountedObject{" +
                "count=" + count +
                '}';
    }
}
