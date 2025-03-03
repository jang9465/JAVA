package com.LEGEND.chap08.level01.basic;

public class ShapeManager {
    private Shape[] shapes = new Shape[10];
    private int index = 0;

    public void addShape(Shape shape) {
        /* 배열에 전달 된 Shape를 추가. 단, 배열의 크기가 부족할 경우 2배로 늘려서 추가. */
        if (index >= shapes.length) { // 배열 크기가 부족하면 확장
            expendArray();
        }
        shapes[index++] = shape; // 배열에 추가 후 인덱스 증가
    }



    public void removeShape(Shape shape) {
        /* 배열에서 전달 된 Shape를 찾아 제거. 단, 제거 된 인덱스가 비어 있지 않도록 뒤에 있는 객체를 앞으로 당김. */
        for(int i = 0; i < index; i++){
            if(shapes[i] == shape){
                for(int j = 1; j < index -1; j++){
                    shapes[j] = shapes[j +1];
                }
                shapes[index - 1] = null;
                index --;
                return;
            }
        }

    }

    public void printAllShapes() {
        /* 배열에 저장 된 모든 도형의 이름, 넓이, 둘레를 출력 */
        for(int i = 0; i < index; i++){
            Shape shape = shapes[i];
            System.out.println(shape.getClass().getSimpleName() +
                    " - 넓이: " + shape.calculateArea() +
                    ", 둘레: " + shape.calculatePerimeter());
        }
    }

    public double getTotalArea() {
        /* 배열에 저장 된 모든 도형의 넓이를 더해서 반환 */
        double sum_area = 0;
        for(int i = 0; i < index; i++){
            sum_area += shapes[i].calculateArea();
        }
        return sum_area;
    }

    public double getTotalPerimeter() {
        /* 배열에 저장 된 모든 도형의 둘레를 더해서 반환 */
        double sum_perimeter = 0;
        for(int i = 0; i < index; i++){
            sum_perimeter += shapes[i].calculatePerimeter();
        }
        return sum_perimeter;
    }

    private void expendArray() {
        Shape[] newShapes = new Shape[shapes.length * 2];
        System.arraycopy(shapes, 0, newShapes, 0, shapes.length);
        shapes = newShapes;
    }

}

