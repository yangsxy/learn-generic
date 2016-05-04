package com.learn.generic.chapter1504;

import com.learn.generic.chapter1503.Generator;

import java.util.Collection;

/**
 * @author zhangfb
 */
public class Generators {

    public static <T> Collection<T> fill(Collection<T> coll, Generator<T> gen, int count) {
        for (int i = 0; i < count; i++) {

            coll.add(gen.next());
        }
        return coll;
    }
}
