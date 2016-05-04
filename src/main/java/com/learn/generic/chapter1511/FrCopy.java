package com.learn.generic.chapter1511;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangfb
 */
public class FrCopy {

    public static <T> T[] copy(T[] a, List<T> list) {
        for (int i = 0; i < a.length; i++) {
            a[i] = list.get(0);
        }
        return a;
    }

    public static void main(String[] args) {
        Integer[] integers = new Integer[5];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }
        // int[] b = copy(integers, list); // error
    }
}
