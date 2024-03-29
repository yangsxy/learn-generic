package com.learn.generic.chapter1507;

/**
 * @author zhangfb
 */
public class GenericHolder<T> {

    private T obj;

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public static void main(String[] args) {
        GenericHolder<String> holder = new GenericHolder<>();
        holder.setObj("zhangfb");
        String s = holder.getObj();
    }
}
