package com.learn.generic.chapter1508;

/**
 * @author zhangfb
 */
public class ClassTypeCapture<T> {

    private Class<T> clazz;

    public ClassTypeCapture(Class<T> clazz) {
        this.clazz = clazz;
    }

    public boolean isInstanceOf(T obj) {
        return clazz.isInstance(obj);
    }
}

class Base {

}

class BaseImpl extends Base {

}
