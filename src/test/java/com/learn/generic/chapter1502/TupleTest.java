package com.learn.generic.chapter1502;

import org.junit.Test;

/**
 * @author zhangfb
 */
public class TupleTest {

    @Test
    public void testTwoTuple() {
        TwoTuple<String, Integer> twoTuple = new TwoTuple<>("zhangfb", 123);
        System.out.println(twoTuple.first);
        System.out.println(twoTuple.second);
        System.out.println(twoTuple);
    }

    @Test
    public void testThreeTuple() {
        ThreeTuple<String, Integer, Double> threeTuple = new ThreeTuple<>("zhangfb", 17, 17.7);
        String first = threeTuple.first;
        System.out.println(first);
        Integer second = threeTuple.second;
        System.out.println(second);
        Double third = threeTuple.third;
        System.out.println(third);
    }
}
