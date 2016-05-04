package com.learn.generic.chapter1507;

import org.junit.Test;

/**
 * @author zhangfb
 */
public class ManipulatorTest {

    @Test
    public void test() {
        Manipulator<HasF> manipulator = new Manipulator<>(new HasF());
        // compile error
        // manipulator.manipulate();
    }
}
