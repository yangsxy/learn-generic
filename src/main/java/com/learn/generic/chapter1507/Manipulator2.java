package com.learn.generic.chapter1507;

/**
 * 泛型类型参数将擦除到它的第一个边界
 * 引导Manipulator3中的示例，说明一个问题，只有希望使用的类型比某个具体类型更加泛化时，泛型才带来好处
 *
 * @author zhangfb
 */
public class Manipulator2<T extends HasF> {

    private T obj;

    public Manipulator2(T obj) {
        this.obj = obj;
    }

    public void manipulate() {
        obj.f();
    }
}
