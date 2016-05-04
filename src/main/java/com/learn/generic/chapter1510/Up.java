package com.learn.generic.chapter1510;

/**
 * @author zhangfb
 */
public class Up {
    public static void main(String[] args) {
        Bound<? extends Cat> bound = new Bound<>();
        Animal animal = bound.getT();

        Bound<? super Cat> bound1 = new Bound<>();
        // compile error
        // bound1.setT(new Animal());
        bound1.setT(new RedCat());
    }
}
class Bound<T> {
    private T t;
    public T getT() { return t; }
    public void setT(T t) { this.t = t; }
}
class Animal{}
class Cat extends Animal{}
class RedCat extends Cat{}
