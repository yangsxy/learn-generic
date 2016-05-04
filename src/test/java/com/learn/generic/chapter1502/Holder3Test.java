package com.learn.generic.chapter1502;

import org.junit.Test;

/**
 * @author zhangfb
 */
public class Holder3Test {

    @Test
    public void test() {
        Holder3<String> holder3 = new Holder3<>("zheangfb");
        holder3.set("wangw");
        System.out.println("name is " + holder3.get());

        // !!! 告诉编译器，你想使用什么类型，编译器帮你搞定一切细节
        Holder3<Automobile> holder31 = new Holder3<>(new Automobile());
        System.out.println("holder31 contain " + holder31.get());
        holder31.set(new AutomobileSub());
        System.out.println("holder31 now contain " + holder31.get());
    }
}
