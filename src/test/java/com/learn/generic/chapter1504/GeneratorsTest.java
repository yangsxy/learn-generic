package com.learn.generic.chapter1504;

import com.learn.generic.chapter1503.CoffeeGenerator;
import com.learn.generic.chapter1503.FibboGenerator;
import com.learn.generic.chapter1503.coffee.Coffee;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author zhangfb
 */
public class GeneratorsTest {

    @Test
    public void test() {
        Collection<Coffee> col = new ArrayList<>();
        col = Generators.fill(col, new CoffeeGenerator(), 5);
        System.out.println(col);

        Collection<Integer> intCol = new ArrayList<>();
        intCol = Generators.fill(intCol, new FibboGenerator(), 5);
        System.out.println(intCol);
    }
}
