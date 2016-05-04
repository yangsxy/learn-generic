package com.learn.generic.chapter1512;

/**
 * @author zhangfb
 */
public class Crg {

    public static void main(String[] args) {
        Subtype sub1 = new Subtype();
        Subtype sub2 = new Subtype();
        sub1.set(sub2);
        Subtype sub3 = sub1.get();
        sub3.execute();
    }
}

class BaseHolder<T> {

    private T t;

    public T get() {
        return t;
    }

    public void set(T t) {
        this.t = t;
    }

    public void execute() {

    }
}

class Subtype extends BaseHolder<Subtype> {
}
