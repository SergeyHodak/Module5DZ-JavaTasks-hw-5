package main.java;

/*
    Задача - можно ли поместить прямоугольник в другой
Очевидно, что это можно сделать лишь в случае, если каждая сторона прямоугольника, который мы вкладываем,
меньше или равна за одну из сторон прямоугольника, куда мы вкладываем.
    Задача
    Напиши класс Rectangle, у которого есть конструктор public Rectangle(int a, int b).
Он принимает два параметра - стороны прямоугольника.
    Напиши метод public boolean canPlaceInto(Rectangle anotherRect). Он принимает другой прямоугольник,
и возвращает true, если текущий прямоугольник можно вписать в прямоугольник anotherRect, и false в противном случае.

Примеры тестов
вызов new Rectangle(10, 5).canPlaceInto(new Rectangle(10, 15)) возвращает true;
вызов new Rectangle(10, 5).canPlaceInto(new Rectangle(1, 15)) возвращает false;
вызов new Rectangle(7, 5).canPlaceInto(new Rectangle(5, 7)) возвращает true;
вызов new Rectangle(100, 5).canPlaceInto(new Rectangle(10, 150)) возвращает true;
 */

class Tasck14 { //class RectangleTest
    public static void main(String[] args) {
        Rectangle14 r1 = new Rectangle14(10, 5);
        Rectangle14 r2 = new Rectangle14(3, 7);
        Rectangle14 r3 = new Rectangle14(10, 15);

        //false
        System.out.println(r1.canPlaceInto(r2));

        //true
        System.out.println(r1.canPlaceInto(r3));

        //true
        System.out.println(r2.canPlaceInto(r3));

        //false
        System.out.println(r3.canPlaceInto(r2));
    }
}

class Rectangle14 {
    private int a;
    private int b;

    public Rectangle14(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public boolean canPlaceInto(Rectangle14 anotherRect) {
        int max1 = Math.max(this.a, this.b);
        int min1 = Math.min(this.a, this.b);
        int max2 = Math.max(anotherRect.a, anotherRect.b);
        int min2 = Math.min(anotherRect.a, anotherRect.b);
        return max1 <= max2 && min1 <= min2;
    }
}