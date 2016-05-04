package com.learn.generic.chapter1504;

import org.junit.Test;

import java.util.List;
import java.util.Map;

/**
 * @author zhangfb
 */
public class NewTest {

    @Test
    public void test() {
        // 1.6、1.7的显式类型
        f(New.<String, List<? extends Pet>>map());
    }

    public static void f(Map<String, List<? extends Pet>> petMap) {
        System.out.println(petMap);
    }

    class Pet {

    }
}
