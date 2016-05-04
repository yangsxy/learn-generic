package com.learn.generic.chapter1511;

import java.util.List;

/**
 * @author zhangfb
 */
public class FixedSizeStack<T> {

    private int index = 0;
    private Object[] objects;

    public FixedSizeStack(int size) {
        objects = new Object[size];
    }

    public void push(T object) {
        objects[index++] = object;
    }

    public T pop() {
        return (T) objects[--index];
    }

    public static void main(String[] args) {
        FixedSizeStack<String> stack = new FixedSizeStack<>(6);
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
        stack.push("E");

        FixedSizeStack s = stack;
        s.push(1234);

        for (int i = 0; i < 6; i++) {
            System.out.println(stack.pop());
        }
    }
}
