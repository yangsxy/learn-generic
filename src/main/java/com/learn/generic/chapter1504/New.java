package com.learn.generic.chapter1504;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangfb
 */
public class New {

    // 类型推导只对赋值有效（1.6，1.7版本，1.8版本无此问题）
    public static <K, V> Map<K, V> map() {
        return new HashMap<>();
    }
}
