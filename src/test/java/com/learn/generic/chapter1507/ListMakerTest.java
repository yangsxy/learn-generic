package com.learn.generic.chapter1507;

import org.junit.Test;

import java.util.List;

/**
 * @author zhangfb
 */
public class ListMakerTest {

    @Test
    public void test() {
        ListMaker<String> listMaker = new ListMaker<>();
        List<String> list = listMaker.create();
        System.out.println(list);
    }
}
