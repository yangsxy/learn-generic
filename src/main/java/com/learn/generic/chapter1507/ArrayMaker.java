package com.learn.generic.chapter1507;

import java.lang.reflect.Array;

/**
 * @author zhangfb
 */
public class ArrayMaker<T> {

    private Class<T> clazz;

    public ArrayMaker(Class<T> clazz) {
        this.clazz = clazz;
    }

//    @SuppressWarnings("unchecked")
    public T[] create(int size) {
        return (T[]) Array.newInstance(clazz, size);
    }
}
