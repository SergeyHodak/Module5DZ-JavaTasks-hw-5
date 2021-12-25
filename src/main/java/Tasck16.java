package main.java;

/*
    Сегмент - внутренний класс
    Создай класс Level, у этого класса создай публичный конструктор, принимающий строку - название уровня.
    Переопредели метод toString() у класса Level так, чтобы он возвращал строку вида Quarke level, name is <LEVEL_NAME>,
где <LEVEL_NAME> - это переданное в конструктор название уровня.

Примеры тестов
вызов System.out.println(new Level("Test")) выводит в консоль Quarke level, name is Test;
 */

class Tasck16 { //class LevelTest
    public static void main(String[] args) {
        //Quarke level, name is Test
        System.out.println(new Level16("Test"));
    }
}

class Level16 {
    private final String nameLevel;

    public Level16(String nameLevel) {
        this.nameLevel = nameLevel;
    }

    @Override
    public String toString() {
        return "Quarke level, name is " + nameLevel;
    }
}