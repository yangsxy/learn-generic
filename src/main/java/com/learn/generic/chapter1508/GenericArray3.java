package com.learn.generic.chapter1508;

import java.lang.reflect.Array;

/**
 * @author zhangfb
 */
public class GenericArray3<T> {

    private T[] array;

    public GenericArray3(Class<T> clazz, int size) {
        array = (T[]) Array.newInstance(clazz, size);
    }

    public void put(int index, T t) {
        array[index] = t;
    }

    public T get(int index) {
        return (T) array[index];
    }

    public T[] rep() {
        return (T[]) array;
    }

    public static void main(String[] args) {
        GenericArray3<Integer> a = new GenericArray3<>(Integer.class, 5);
        for (int i = 0; i < 5; i++) {
            a.put(i, i);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(a.get(i));
        }

        try {
            Integer[] ai = a.rep();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
