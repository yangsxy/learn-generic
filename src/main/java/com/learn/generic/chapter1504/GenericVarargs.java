package com.learn.generic.chapter1504;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangfb
 */
public class GenericVarargs {

    public static <T> List<T> makeList(T... args) {
        List<T> list = new ArrayList<>();
        for (T arg : args) {
            list.add(arg);
        }
        return list;
    }
}
