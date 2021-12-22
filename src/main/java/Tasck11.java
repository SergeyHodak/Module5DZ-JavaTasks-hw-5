package main.java;

/*
    Задача - найти площадь прямоугольника
Напиши класс RectangleArea, у которого есть конструктор public RectangleArea(int[] coords).
Первые два элемента - это x и y первой точки прямоугольника, последние два элемента - это x и y противоположной точки.

У этого класса есть метод public int getArea(), который возвращает площадь прямоугольника.

Примеры тестов
Выполнение кода:

 int[] coords = {2, 2, 12, 12};
//Expect 100
System.out.println(new RectangleArea(coords).getArea());
выводит в консоль 100.
 */

class Tasck11 { //class RectangleAreaTest
    public static void main(String[] args) {
        int[] coords = {2, 2, 12, 12};

        //Expect 100
        System.out.println(new RectangleArea11(coords).getArea());
    }
}

class RectangleArea11 {
    private final int x1;
    private final int x2;
    private final int y1;
    private final int y2;

    public RectangleArea11(int[] coords) {
        this.x1 = coords[0];
        this.x2 = coords[2];
        this.y1 = coords[1];
        this.y2 = coords[3];
    }

    public int getArea() {
        int a = x2 - x1;
        int b = y2 - y1;
        return Math.abs(a * b);
    }
}