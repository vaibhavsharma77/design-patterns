package com.factory.pattern.impl;

import com.factory.pattern.itf.Shape;

public class ShapeFactory {

    public Shape getShapeType(String shape){
        if(shape==null){
            return null;
        }
        if (shape.equalsIgnoreCase("circle")) {

            return new Circle();
        }else{
            return new Triangle();
        }
    }
}
