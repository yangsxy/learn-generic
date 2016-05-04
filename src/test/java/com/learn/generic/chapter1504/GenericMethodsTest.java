package com.learn.generic.chapter1504;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author zhangfb
 */
public class GenericMethodsTest {

    @Test
    public void test() {
        GenericMethods methods = new GenericMethods();
        methods.f("zhang");
        methods.f(123);
        methods.f(123.23);
        methods.f(new BigDecimal("23"));
        methods.f(new Date());
    }
}
