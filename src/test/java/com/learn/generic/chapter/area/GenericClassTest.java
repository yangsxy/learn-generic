package com.learn.generic.chapter.area;

import com.alibaba.fastjson.TypeReference;
import org.junit.Test;

import java.lang.reflect.*;
import java.util.Map;

/**
 * @author zhangfb
 */
public class GenericClassTest {

    @Test
    public void test() throws Exception {
        GenericClass<String> gen = new GenericClass<>();
        Method method = gen.getClass().getMethod("genericMethod", Map.class);
        TypeVariable<Method>[] methodTypes = method.getTypeParameters();
        System.out.println(methodTypes[0].getName());

        Field field = gen.getClass().getDeclaredField("list");
        field.setAccessible(true);
        Type type = field.getGenericType();
        System.out.println(type);

        field = gen.getClass().getDeclaredField("map");
        field.setAccessible(true);
        type = field.getGenericType();
        System.out.println(type);

        Type gType = field.getGenericType();
        if (gType instanceof ParameterizedType) {
            ParameterizedType pType = (ParameterizedType) gType;
            Type rType = pType.getRawType();
            System.out.println("原始类型是：" + rType);
            Type[] tArgs = pType.getActualTypeArguments();
            System.out.println("泛型类型是：");
            for (int i = 0; i < tArgs.length; i++) {
                System.out.println("第" + i + "个泛型类型是：" + tArgs[i]);
            }
        }
    }

    @Test
    public void test2() {
        TypeReference t = new TypeReference<GenericClass<String>>(){};
        System.out.println(t.getType());
    }
}
