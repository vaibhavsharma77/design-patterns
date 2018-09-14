package com.factory.pattern.impl;

import com.factory.pattern.itf.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle");
    }
}
