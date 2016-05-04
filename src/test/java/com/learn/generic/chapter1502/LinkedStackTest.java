package com.learn.generic.chapter1502;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author zhangfb
 */
public class LinkedStackTest {

    @Test
    public void test() {
        LinkedStack<String> stack = new LinkedStack<>();
        final int size = 5;
        for (int i = 0; i < size; i++) {
            stack.push("name" + i);
        }
        for (int i = 0; i < size; i++) {
            Assert.assertThat("name" + (size - 1 - i), Is.is(stack.pop()));
        }
    }
}
