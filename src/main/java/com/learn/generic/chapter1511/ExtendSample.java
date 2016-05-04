package com.learn.generic.chapter1511;

/**
 * @author zhangfb
 */
public class ExtendSample {

    interface A<T> {}

    class B implements A<String> {}

    // error
    // class C extends B implements A<Integer> {}
}
