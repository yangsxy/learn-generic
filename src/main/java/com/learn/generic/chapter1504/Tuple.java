package com.learn.generic.chapter1504;

import com.learn.generic.chapter1502.ThreeTuple;
import com.learn.generic.chapter1502.TwoTuple;

/**
 * @author zhangfb
 */
public class Tuple {

    public static <A, B> TwoTuple<A, B> tuple2(A a, B b) {
        return new TwoTuple<>(a, b);
    }

    public static <A, B, C> ThreeTuple<A, B, C> tuple3(A a, B b, C c) {
        return new ThreeTuple<>(a, b, c);
    }

    public static <A, B> TwoTuple tuple2simple(A a, B b) {
        return new TwoTuple<>(a, b);
    }
}
