package com.factory.pattern.config;

import com.factory.pattern.impl.ShapeFactory;
import com.factory.pattern.itf.Shape;

public class Test {

    public static void main(String[] args) {
        ShapeFactory shapeFactory=new ShapeFactory();
        Shape shape=shapeFactory.getShapeType("circle");
        shape.draw();
    }
}
