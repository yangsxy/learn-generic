package com.learn.generic.chapter1507;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangfb
 */
public class FilledListMaker<T> {

    public List<T> create(T t, int n) {
        List<T> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(t);
        }
        return list;
    }
}
