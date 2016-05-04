package com.learn.generic.chapter1507;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * @author zhangfb
 */
public class ArrayListTest {

    @Test
    public void test() {
        Class a = new ArrayList<String>().getClass();
        Class b = new ArrayList<Long>().getClass();
        Assert.assertEquals(a, b);
    }
}
