package com.learn.generic;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangfb
 */
public class Bean {

    public Map<String, ListBean> list = new HashMap<>();

    public static void main(String[] args) throws SecurityException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException
    {
        Field c = Bean.class.getField("list");
        Field f = Field.class.getDeclaredField("signature");
        f.setAccessible(true);
        System.out.println(((String) f.get(c)));

    }
}

class ListBean {

}