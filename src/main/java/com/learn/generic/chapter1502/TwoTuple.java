package com.learn.generic.chapter1502;

/**
 * @author zhangfb
 */
public class TwoTuple<A, B> {

    public final A first;
    public final B second;

    public TwoTuple(A first, B second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "TwoTuple{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
