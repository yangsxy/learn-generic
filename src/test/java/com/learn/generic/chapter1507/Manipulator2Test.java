package com.learn.generic.chapter1507;

import org.junit.Test;

/**
 * @author zhangfb
 */
public class Manipulator2Test {

    @Test
    public void test() {
        Manipulator2<HasF> manipulator2 = new Manipulator2<>(new HasF());
        manipulator2.manipulate();
    }
}
