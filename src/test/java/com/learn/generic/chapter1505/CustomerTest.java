package com.learn.generic.chapter1505;

import com.learn.generic.chapter1503.Generator;
import org.junit.Test;

/**
 * @author zhangfb
 */
public class CustomerTest {

    @Test
    public void test() {
        Generator<Customer> gen = Customer.gen();
        for (int i = 0; i < 5; i++) {
            System.out.println(gen.next());
        }
    }
}
