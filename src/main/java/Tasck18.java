package main.java;

/*
    Задание - создать класс LevelInfo
Информация про игровой уровень включает в себя, кроме названия, и сложность уровня - легкий, средний, тяжелый.
Если просто добавлять поля в класс Level, то код класса будет разрастаться, конструктор будет увеличиваться.
Это плохо, лучше такую связанную информацию выделять в отдельный класс, с названием LevelInfo, например,
и хранить там всю информацию.
    Задание
    В классе Level опиши статический внутренний класс с именем LevelInfo.
    У класса LevelInfo должны быть два приватных поля типа String с именами name и difficulty - имя и сложность уровня соответственно.
        Для этих полей объяви публичные геттеры.
        Также создай публичный конструктор LevelInfo(String name, String difficulty), в котором ты задашь значения этим свойствам.
    У класса Level удали поле String name. Вместо него добавь поле LevelInfo levelInfo, и принимай именно
это поле первым параметром в конструкторе класса Level вместо поля String name.
    Измени метод toString() у класса Level так, чтобы он возвращал строку
Quarke level, name is <LEVEL_NAME>, difficulty is <DIFFICULTY>, point count is <POINT_COUNT>
Вместо <LEVEL_NAME> <DIFFICULTY> <POINT_COUNT> подставь значения названия уровня, сложности и
количества точек уровня соответственно.

Примеры тестов
Выполнение кода

Level.Point p1 = new Level.Point(3, 5);
Level.Point p2 = new Level.Point(10, 100);
Level.Point p3 = new Level.Point(50, 40);

Level.Point points = {p1, p2, p3};

Level.LevelInfo info = new LevelInfo("Quarke Intro", "Easy");

//Quarke level, name is Quarke Intro, difficulty is Easy, point count is 3
System.out.println(new Level(info, points));
выведет в консоль текст Quarke level, name is Quarke Intro, difficulty is Easy, point count is 3
 */

class Level18 {
    private final Point[] points;
    LevelInfo levelInfo;

    public Level18(LevelInfo levelInfo, Point[] points) {
        this.levelInfo = levelInfo;
        this.points = points;
    }

    @Override
    public String toString() {
        return "Quarke level, name is " + levelInfo.getName() + ", difficulty is "
                + levelInfo.getDifficulty() + ", point count is " + points.length;
    }

    static class Point {
        private int x, y;

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
        private final String name, difficulty;

        public String getName() {
            return name;
        }

        public String getDifficulty() {
            return difficulty;
        }

        public LevelInfo(String name, String difficulty) {
            this.name = name;
            this.difficulty = difficulty;
        }
    }
}

class Tasck18 { //class LevelTest
    public static void main(String[] args) {
        Level18.Point p1 = new Level18.Point(3, 5);
        Level18.Point p2 = new Level18.Point(10, 100);
        Level18.Point p3 = new Level18.Point(50, 40);

        Level18.Point[] points = {p1, p2, p3};

        Level18.LevelInfo info = new Level18.LevelInfo("Quarke Intro", "Easy");

        //Quarke level, name is Quarke Intro, difficulty is Easy, point count is 3
        System.out.println(new Level18(info, points));
    }
}