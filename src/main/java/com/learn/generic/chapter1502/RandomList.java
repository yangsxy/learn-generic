package com.learn.generic.chapter1502;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author zhangfb
 */
public class RandomList<T> {

    private List<T> list = new ArrayList<>();
    private Random random = new Random(47);

    public void add(T t) {
        this.list.add(t);
    }

    public T select() {
        return list.get(random.nextInt(list.size()));
    }
}
