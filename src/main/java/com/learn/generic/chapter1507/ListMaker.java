package com.learn.generic.chapter1507;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangfb
 */
public class ListMaker<T> {

    List<T> create() {
        return new ArrayList<>();
    }
}
