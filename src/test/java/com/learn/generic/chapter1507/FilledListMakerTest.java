package com.learn.generic.chapter1507;

import org.junit.Test;

import java.util.List;

/**
 * @author zhangfb
 */
public class FilledListMakerTest {

    @Test
    public void test() {
        FilledListMaker<String> maker = new FilledListMaker<>();
        List<String> list = maker.create("zhang", 5);
        System.out.println(list);
    }
}
