package com.learn.generic.chapter1508;

/**
 * @author zhangfb
 */
public class GenericArray<T> {

    private T[] array;

    public GenericArray(int size) {
        array = (T[]) new Object[size];
    }

    public void put(int index, T t) {
        array[index] = t;
    }

    public T get(int index) {
        return array[index];
    }

    public T[] rep() {
        return array;
    }

    public static void main(String[] args) {
        GenericArray<Integer> a = new GenericArray<>(5);
        Integer[] ai = a.rep();
    }
}
