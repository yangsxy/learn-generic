package com.learn.generic.chapter1503;

import com.learn.generic.chapter1503.coffee.*;

import java.util.Iterator;
import java.util.Random;

/**
 * @author zhangfb
 */
public class CoffeeGenerator implements Generator<Coffee>, Iterable<Coffee> {

    private static final Random random = new Random(47);
    private Class[] types = {Latte.class, Brave.class, Amera.class, Moche.class};
    private int size = 0;

    public CoffeeGenerator() {
    }

    public CoffeeGenerator(int size) {
        this.size = size;
    }

    @Override
    public Coffee next() {
        try {
            return (Coffee) types[random.nextInt(types.length)].newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    private class CoffeeIterator implements Iterator<Coffee> {

        int count = size;

        @Override
        public boolean hasNext() {
            return count > 0;
        }

        @Override
        public Coffee next() {
            count--;
            return CoffeeGenerator.this.next();
        }
    }

    @Override
    public Iterator<Coffee> iterator() {
        return new CoffeeIterator();
    }
}
