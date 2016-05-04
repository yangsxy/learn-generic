package com.learn.generic.chapter1513;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author zhangfb
 */
public class SafeCast {

    static void rawAdd(List list) {
        list.add(new Cat());
    }

    public static void main(String[] args) {
        // insert a cat to dogs
        List<Dog> dogs = new ArrayList<>();
        rawAdd(dogs);

        // throw an exception in running
        List<Dog> dogs2 = Collections.checkedList(new ArrayList<Dog>(), Dog.class);
        rawAdd(dogs2);
    }
}

class Cat {

}

class Dog {

}