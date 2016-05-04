package com.learn.generic.chapter1505;

import com.learn.generic.chapter1503.Generator;

/**
 * @author zhangfb
 */
public class Teller {

    private static long counter = 0;
    private long count = counter++;
    private static Generator<Teller> gen = new Generator<Teller>() {
        @Override
        public Teller next() {
            return new Teller();
        }
    };

    public static Generator<Teller> gen() {
        return gen;
    }

    @Override
    public String toString() {
        return "Teller{" +
                "count=" + count +
                '}';
    }
}
