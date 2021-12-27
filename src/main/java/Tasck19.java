package main.java;

/*
    Задание - посчитать хеш уровня
В нашем случае алгоритм хеширования очень простой. Для каждой точки мы умножаем координаты x и y,
и складываем сумму всех этих умножений. Полученное число и будет хешем.

Задание
В классе Level напиши метод calculateLevelHash(), который бы возвращал число в соответствии с описанным выше алгоритмом.

Примеры тестов
Выполнение кода

Level.Point p1 = new Level.Point(3, 5);
Level.Point p2 = new Level.Point(10, 100);
Level.Point p3 = new Level.Point(50, 40);

Level.Point[] points = {p1, p2, p3};

Level.LevelInfo info = new Level.LevelInfo("Quarke Intro", "Easy");

//3015
System.out.println(new Level(info, points).calculateLevelHash());
выводит в консоль 3015 (3*5 + 10*100 + 50*40)
 */

class Level19 {
    private final LevelInfo levelInfo;
    private final Point[] points;

    public Level19(LevelInfo levelInfo, Point[] points) {
        this.levelInfo = levelInfo;
        this.points = points;
    }

    public int calculateLevelHash() {
        int result = 0;
        for (Point point : points) {
            result += point.x * point.y;
        }
        return result;
    }

    @Override
    public String toString() {
        return "Quarke level, name is " + levelInfo.getName() + ", difficulty is " + levelInfo.getDifficulty() + ", point count is " + points.length;
    }

    static class Point {
        private final int x, y;

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

    static class LevelInfo {
        private final String name;
        private final String difficulty;

        public LevelInfo(String name, String difficulty) {
            this.name = name;
            this.difficulty = difficulty;
        }

        public String getName() {
            return name;
        }

        public String getDifficulty() {
            return difficulty;
        }
    }
}

class Tasck19 { //class LevelTest
    public static void main(String[] args) {
        Level19.Point p1 = new Level19.Point(3, 5);
        Level19.Point p2 = new Level19.Point(10, 100);
        Level19.Point p3 = new Level19.Point(50, 40);

        Level19.Point[] points = {p1, p2, p3};

        Level19.LevelInfo info = new Level19.LevelInfo("Quarke Intro", "Easy");

        //3015
        System.out.println(new Level19(info, points).calculateLevelHash());
    }
}