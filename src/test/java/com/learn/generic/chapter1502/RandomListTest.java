package com.learn.generic.chapter1502;

import org.junit.Test;

/**
 * @author zhangfb
 */
public class RandomListTest {

    @Test
    public void test() {
        RandomList<String> list = new RandomList<>();
        for (int i = 0; i < 7; i++) {
            list.add("name" + i);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(list.select());
        }
    }
}
