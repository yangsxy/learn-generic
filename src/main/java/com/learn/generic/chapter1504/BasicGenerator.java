package com.learn.generic.chapter1504;

import com.learn.generic.chapter1503.Generator;

/**
 * @author zhangfb
 */
public class BasicGenerator<T> implements Generator<T> {

    private Class<T> clazz;

    public BasicGenerator(Class<T> clazz) {
        this.clazz = clazz;
    }

    @Override
    public T next() {
        try {
            return clazz.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new UnsupportedOperationException(e);
        }
    }

    public static <T> Generator<T> create(Class<T> clazz) {
        return new BasicGenerator<>(clazz);
    }
}
