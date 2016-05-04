package com.learn.generic.chapter1507;

/**
 * @author zhangfb
 */
public class GenericBase<T> {

    private T obj;

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}

class Derived1<T> extends GenericBase<T> {

}

class Derived2 extends GenericBase {

}
