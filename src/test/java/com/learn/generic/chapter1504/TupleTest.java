package com.learn.generic.chapter1504;

import com.learn.generic.chapter1502.ThreeTuple;
import com.learn.generic.chapter1502.TwoTuple;
import org.junit.Test;

/**
 * @author zhangfb
 */
public class TupleTest {

    @Test
    public void test() {
        TwoTuple<String, Integer> twoTuple = Tuple.tuple2("zhang", 17);
        ThreeTuple<String, Integer, Double> threeTuple = Tuple.tuple3("zhang", 17, 23.2);
        // 向上转型没有警告
        TwoTuple<String, Integer> twoTuple2simple = Tuple.tuple2("zhang", 17);
        // 向下转型，here have a warning
        twoTuple = Tuple.tuple2simple("zhang", 17);
    }
}
