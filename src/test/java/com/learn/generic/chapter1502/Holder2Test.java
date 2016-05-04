package com.learn.generic.chapter1502;

import org.junit.Test;

/**
 * @author zhangfb
 */
public class Holder2Test {

    @Test
    public void test() {
        Holder2 holder2 = new Holder2("zhangfb");
        String name = (String) holder2.getObj();
        System.out.println("name is " + name);
    }
}
