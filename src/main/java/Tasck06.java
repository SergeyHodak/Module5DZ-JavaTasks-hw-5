package main.java;

/*
    Задание - пули ведут себя странно
при создании каждой пули выводить в консоль текст Bullet created!.
    Задание
    В коде уже есть описанный класс Bullet. Допиши в этот класс блок инициализации,
чтобы при каждом созданииобъекта типа Bullet в консоль выводился бы текст Bullet created!. Не создавай ни одного конструктора в классе Bullet.

Примеры тестов
Выполнение кода:

new Bullet();
new Bullet();
выведет в консоль текст:

Bullet created!
Bullet created!
в классе Bullet нет ни одного конструктора
 */

class Bullet06 { //class Bullet06
    {
        System.out.println("Bullet created!");
    }
}

class Tasck06 { //class BulletTest
    public static void main(String[] args) {
        new Bullet06();
        new Bullet06();
    }
}