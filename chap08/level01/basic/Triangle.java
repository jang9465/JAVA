package com.LEGEND.chap08.level01.basic;

public class Triangle extends Shape implements Resizable{

    private double base;    // 밑변
    private double height;  // 높이
    private double side1;   // 첫 번째 변
    private double side2;   // 두 번째 변
    private double side3;   // 세 번째 변

    public Triangle(double base, double height, double side1, double side2, double side3) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public void resize(double factor) {
        this.base *= factor;
        this.height *= factor;
        this.side1 *= factor;
        this.side2 *= factor;
        this.side3 *= factor;
    }

    @Override
    public double calculateArea() {
        return (base * height) / 2;
    }

    @Override
    double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}
