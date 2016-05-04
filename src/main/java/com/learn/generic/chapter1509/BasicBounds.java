package com.learn.generic.chapter1509;

import java.awt.*;

/**
 * @author zhangfb
 */
public class BasicBounds {

    public static void main(String[] args) {
        Solid<Bounded> solid = new Solid<>(new Bounded());
        System.out.println(solid.color());
        System.out.println(solid.getX() + ", " + solid.getY() + ", " + solid.getZ());
        System.out.println(solid.weight());
        Solid<? extends Dimension> solid1 = new Solid<>(new SubBounded());

    }
}

interface HasColor {
    java.awt.Color getColor();
}

class Colored<T extends HasColor> {
    T item;

    public Colored(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    java.awt.Color color() {
        return item.getColor();
    }
}

class Dimension {
    public int x, y, z;
}

class ColoredDimension<T extends Dimension & HasColor> {
    private T item;

    public ColoredDimension(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    java.awt.Color color() {
        return item.getColor();
    }

    int getX() {
        return item.x;
    }

    int getY() {
        return item.y;
    }

    int getZ() {
        return item.z;
    }
}

interface Weight {
    int weight();
}

class Solid<T extends Dimension & HasColor & Weight> {
    private T item;

    public Solid(T item) {
        this.item = item;
    }

    java.awt.Color color() {
        return item.getColor();
    }

    int getX() {
        return item.x;
    }

    int getY() {
        return item.y;
    }

    int getZ() {
        return item.z;
    }

    int weight() {
        return item.weight();
    }
}

class Bounded extends Dimension implements HasColor, Weight {

    @Override
    public Color getColor() {
        return new Color(1,1,1);
    }

    @Override
    public int weight() {
        return 23;
    }
}

class SubBounded extends Dimension implements HasColor, Weight {

    @Override
    public Color getColor() {
        return new Color(1,1,1);
    }

    @Override
    public int weight() {
        return 23;
    }
}


