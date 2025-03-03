package com.LEGEND.chap08.level01.basic;

public class Circle extends Shape implements Resizable{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }


    @Override
    public void resize(double factor) {
        this.radius *= factor;
    }


    @Override
    public double calculateArea() {
//        return radius * radius * 3.14;
        return radius * radius * Math.PI;
    }

    @Override
    double calculatePerimeter() {
//        return 2 * radius * 3.14;
        return 2 * radius * Math.PI;
    }

}
