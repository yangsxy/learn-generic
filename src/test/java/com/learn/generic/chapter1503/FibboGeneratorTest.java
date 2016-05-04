package com.learn.generic.chapter1503;

import org.junit.Test;

/**
 * @author zhangfb
 */
public class FibboGeneratorTest {

    @Test
    public void test() {
        Generator<Integer> gen = new FibboGenerator();
        for (int i = 0; i < 20; i++) {
            System.out.print(gen.next() + " ");
        }
        System.out.println();
    }
}
