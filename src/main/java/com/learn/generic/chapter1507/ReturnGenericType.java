package com.learn.generic.chapter1507;

/**
 * getObj方法调用之后，将返回具体子类，如HasFImpl，而非基类。
 *
 * @author zhangfb
 */
public class ReturnGenericType<T extends HasF> {

    private T obj;

    public ReturnGenericType(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }
}
