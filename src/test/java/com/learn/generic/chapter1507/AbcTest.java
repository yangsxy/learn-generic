package com.learn.generic.chapter1507;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangfb
 */
public class AbcTest {

    /*@Test
    public void test() {
        List<? extends Base> list = new ArrayList<Subtype>();
        list.add(new Subtype());
        Base b2 = list.get(0);

        List<? super Base> list1 = new ArrayList<>();
        list1.add(new Base());
        list1.add(new Subtype());
        Base b =  list1.get(0);

        List list2 = list1;
        list2.add("String");
        list2.add(134);
    }*/

}

class Base {

}

class Subtype extends Base {

}

class Subtype2 extends Base {

}
