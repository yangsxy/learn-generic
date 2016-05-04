package com.learn.generic.chapter1503;

import com.learn.generic.chapter1503.coffee.Coffee;
import org.junit.Test;

/**
 * @author zhangfb
 */
public class GeneratorTest {

    @Test
    public void test() {
        Generator<Coffee> generator = new CoffeeGenerator();
        for (int i = 0; i < 5; i++) {
            System.out.println(generator.next());
        }
        for (Coffee coffee : new CoffeeGenerator(5)) {
            System.out.println(coffee);
        }
    }
}
