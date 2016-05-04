package com.learn.generic.chapter1511;

/**
 * @author zhangfb
 */
public class Cast {

    public static void main(String[] args) {
        Object o = "zhangfb";
        String s1 = (String) o;
        String s2 = String.class.cast(o);
    }
}
