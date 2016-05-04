package com.learn.generic.chapter1507;

import org.junit.Test;

/**
 * @author zhangfb
 */
public class GenericBaseTest {

    @Test
    public void test() {
        Derived2 d2 = new Derived2();
        System.out.println(d2.getObj());
        d2.setObj(new Object()); // 有一个警告！
    }
}
