package com.learn.generic.chapter.area;

import java.util.List;
import java.util.Map;

/**
 * @author zhangfb
 */
public class GenericClass<T> {                // 1
    private List<T> list;                     // 2
    private Map<String, T> map;               // 3

    public <U> U genericMethod(Map<T, U> m) { // 4
        return null;
    }
}
