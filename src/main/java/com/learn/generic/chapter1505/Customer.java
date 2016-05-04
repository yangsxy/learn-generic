package com.learn.generic.chapter1505;

import com.learn.generic.chapter1503.Generator;

/**
 * @author zhangfb
 */
public class Customer {

    private static long counter = 0;
    private long count = counter++;

    public static Generator<Customer> gen() {
        return new Generator<Customer>() {
            @Override
            public Customer next() {
                return new Customer();
            }
        };
    }

    @Override
    public String toString() {
        return "Customer{" +
                "count=" + count +
                '}';
    }
}
