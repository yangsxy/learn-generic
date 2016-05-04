package com.learn.generic.chapter1507;

import org.junit.Test;

import java.util.*;

/**
 * @author zhangfb
 */
public class LostInformationTest {

    // !!! 在泛型代码内部，无法获得任何有关泛型参数类型的信息。
    @Test
    public void test() {
        List<String> strings = new ArrayList<>();
        System.out.println(Arrays.toString(strings.getClass().getTypeParameters()));

        Map<String, Integer> map  = new HashMap<>();
        System.out.println(Arrays.toString(map.getClass().getTypeParameters()));

        LostInformation<Double> lostInformation = new LostInformation<>();
        System.out.println(Arrays.toString(lostInformation.getClass().getTypeParameters()));
    }
}
