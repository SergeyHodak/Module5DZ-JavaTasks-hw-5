package main.java;

/*
    Задание - пишем загрузчик уровней
Это класс, который загружает файл игры с диска, сохраняет его в оперативной памяти для дальнейшего использования.
Загрузка уровня - это ресурсоемкая операция, и уже загруженные уровни хорошо бы кешировать.
Для этого можно воспользоваться паттерном синглтон, внутри которого и будет происходить кеширование.
Это не лучший в жизни паттерн проектирования, но для наших потребностей он пригодится.
Мы начнем с описания загрузчика уровней, а потом модифицируем его до синглтона.
    Задание
    Напиши класс LevelLoader. У этого класса создай метод String load(String levelName). Метод принимает один параметр
- имя уровня, и возвращает строку Loading level <LEVEL_NAME> ..., где вместо <LEVEL_NAME> подставляется переданное имя уровня.

Примеры тестов
выполнение кода new LevelLoader().load("StartLevel") возвращает строку Loading level StartLevel ....
 */

class LevelLoader21 {
    String load(String levelName) {
        return "Loading level " + levelName + " ...";
    }
}

class Tasck21 { //class LevelLoaderTest
    public static void main(String[] args) {
        LevelLoader21 levelLoader = new LevelLoader21();

        //Loading level Startlevel ...
        System.out.println(levelLoader.load("StartLevel"));
    }
}