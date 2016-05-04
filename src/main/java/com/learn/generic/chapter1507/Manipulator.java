package com.learn.generic.chapter1507;

/**
 * @author zhangfb
 */
public class Manipulator<T> {

    private T obj;

    public Manipulator(T obj) {
        this.obj = obj;
    }

    // a compile error comes here
    /*public void manipulate() {
        obj.f();
    }*/
}
