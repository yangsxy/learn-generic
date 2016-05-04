package com.learn.generic.chapter1502;

import org.junit.Test;

/**
 * @author zhangfb
 */
public class Holder1Test {

    @Test
    public void test() {
        Holder1 holder1 = new Holder1(new Automobile());
        Automobile a = holder1.get();
        System.out.println(a);
    }
}
