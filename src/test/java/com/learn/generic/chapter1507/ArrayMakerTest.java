package com.learn.generic.chapter1507;

import org.junit.Test;

/**
 * @author zhangfb
 */
public class ArrayMakerTest {

    @Test
    public void test() {
        ArrayMaker<String> maker = new ArrayMaker<>(String.class);
        String[] array = maker.create(5);
        // 所有的都是null
        for (String s : array) {
            System.out.println(s);
        }
    }
}
