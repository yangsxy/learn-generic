package com.learn.generic.chapter1511;

import java.util.Comparator;

/**
 * @author zhangfb
 */
public class PetCast {
}
class ComparablePet implements Comparable<ComparablePet> {
    @Override
    public int compareTo(ComparablePet o) {
        return 0;
    }
}
// can't compile
/*class ComparableCat extends ComparablePet implements Comparable<ComparableCat> {
    @Override
    public int compareTo(ComparableCat o) {return 0;}
}*/
