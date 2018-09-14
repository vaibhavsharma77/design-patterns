package com.factory.pattern.impl;

import com.factory.pattern.itf.Shape;

public class Triangle  implements Shape {
    @Override
    public void draw() {
        System.out.println("Triangle");
    }
}
