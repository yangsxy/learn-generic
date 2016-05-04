package com.learn.generic.chapter1504;

import org.junit.Test;

import java.util.List;

/**
 * @author zhangfb
 */
public class GenericVarargsTest {

    @Test
    public void test() {
        List<String> list = GenericVarargs.makeList("zhang", "fu", "bing");
        System.out.println(list);

        list = GenericVarargs.makeList("zhangfubing".split(""));
        System.out.println(list);
    }
}
