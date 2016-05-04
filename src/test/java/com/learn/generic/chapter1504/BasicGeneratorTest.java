package com.learn.generic.chapter1504;

import com.learn.generic.chapter1503.Generator;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author zhangfb
 */
public class BasicGeneratorTest {

    @Test
    public void test() {
        Generator<CountedObject> gen = BasicGenerator.create(CountedObject.class);
        for (int i = 0; i < 5; i++) {
            System.out.println(gen.next());
        }
        Generator<Integer> intGen = BasicGenerator.create(Integer.class);
        try {
            System.out.println(intGen.next());
            Assert.fail("intGen must have throw an exception.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
