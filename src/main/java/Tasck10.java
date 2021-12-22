package main.java;

/*
    Задача - расстояние между объектами
Используй класс Math из стандартной библиотеки Java для облегчения своей работы, и решения
этой и последующих задач. Если не знаешь, какие методы использовать - поищи официальную документацию
в Интернете, это часть ежедневной работы программиста.
Первая задача, которую нужно решить - научиться считать расстояние между двумя точками.
    Задача
    Напиши класс Distance, у которого есть конструктор Distance(int startX, int startY, int endX, int endY).
Этот конструктор принимает 4 параметра - координаты начальной точки (startX и startY),
и координаты конечной точки (endX и endY).
    У класса также должен быть метод public int getDistance(). Он возвращает расстояние между точками,
координаты которых переданы в конструктор. Расстояние округляется по правилам математического округления,
возвращается целый результат.

Примеры тестов
вызов new Distance(10, 10, 20, 20).getDistance() возвращает 14 (округлено от 14.142135623730951)
вызов new Distance(10, 10, 27, 25).getDistance() возвращает 23 (округлено от 22.67156809750927)
 */

class Tasck10 { //class DistanceTest
    public static void main(String[] args) {
        //Expect 14
        System.out.println(new Distance10(10, 10, 20, 20).getDistance());

        //Expect 23
        System.out.println(new Distance10(10, 10, 27, 25).getDistance());
    }
}

class Distance10 {
    private final int startX;
    private final int startY;
    private final int endX;
    private final int endY;

    public Distance10(int startX, int startY, int endX, int endY) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
    }

    public int getDistance() {
        int a = endX - startX;
        int b = endY - startY;
        return (int) Math.round(Math.sqrt(a * a + b * b));
    }
}