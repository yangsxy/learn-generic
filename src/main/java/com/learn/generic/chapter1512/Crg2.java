package com.learn.generic.chapter1512;

/**
 * @author zhangfb
 */
public class Crg2 {

    public static void main(String[] args) {

    }

    static class BaseHolder<T extends BaseHolder> {
        private T t;
        public T get() {
            return t;
        }
        public void set(T t) {
            this.t = t;
        }
        public void execute() {}
    }

    class A extends BaseHolder<A> {}
    class B extends BaseHolder<B> {}
    class C extends BaseHolder<B> {}

    class D {}
    // can't compile
    // class E extends BaseHolder<D> {}
}
