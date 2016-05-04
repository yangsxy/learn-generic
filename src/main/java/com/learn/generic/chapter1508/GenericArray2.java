package com.learn.generic.chapter1508;

/**
 * @author zhangfb
 */
public class GenericArray2<T> {

    private Object[] array;

    public GenericArray2(int size) {
        array = new Object[size];
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
        GenericArray2<Integer> a = new GenericArray2<>(5);
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
