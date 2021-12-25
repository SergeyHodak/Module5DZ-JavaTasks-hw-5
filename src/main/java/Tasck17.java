package main.java;

/*
    Задание - добавляем точки нашему уровню
    В классе Level опиши статический внутренний класс с именем Point. У этого класса должны быть
два приватных поля типа int с именем x и y. Для каждого поля создай публичный геттер. Также у этого
класса должен быть публичный конструктор, который принимает эти два параметра.

    Добавь классу Level приватное поле Point[] points, и замени конструктор Level(String name)
на конструктор Level(String name, Point[] points).
    Измени метод toString() у класса Level так, чтобы он возвращал строку вида
Quarke level, name is <LEVEL_NAME>, point count is <POINT_COUNT>, где <LEVEL_NAME> - имя уровня,
а <POINT_COUNT> - количество точек.

Примеры тестов
Выполнение кода

Level.Point p1 = new Level.Point(3, 5);
Level.Point p2 = new Level.Point(10, 100);
Level.Point p3 = new Level.Point(50, 40);

Level.Point points = {p1, p2, p3};

//Quarke level, name is Test, point count is 3
System.out.println(new Level("Test", points));
выводит в консоль строку Quarke level, name is Test, point count is 3.
 */

class Tasck17 { //class Level
    private final Point[] points;
    private final String levelName;

    public Tasck17(String levelName, Point[] points) {
        this.levelName = levelName;
        this.points = points;
    }

    @Override
    public String toString() {
        return "Quarke level, name is " + levelName + ", point count is " + points.length;
    }

    static class Point {
        private final int x;
        private final int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }
}

class LevelTest17 {
    public static void main(String[] args) {
        Tasck17.Point p1 = new Tasck17.Point(3, 5);
        Tasck17.Point p2 = new Tasck17.Point(10, 100);
        Tasck17.Point p3 = new Tasck17.Point(50, 40);

        Tasck17.Point[] points = {p1, p2, p3};

        //Quarke level, name is Test, point count is 3
        System.out.println(new Tasck17("Test", points));
    }
}