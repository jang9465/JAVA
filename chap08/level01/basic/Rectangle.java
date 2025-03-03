package com.LEGEND.chap08.level01.basic;

public class Rectangle extends Shape implements Resizable{
    private double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void resize(double factor) {
        this.width *= factor;
        this.height *= factor;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    double calculatePerimeter() {
        return 2*(width + height);
    }
}
