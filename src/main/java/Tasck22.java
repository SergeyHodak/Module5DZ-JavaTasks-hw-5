package main.java;

/*
    Задание - сделать статическое поле
Отлично, базовый загрузчик уровней написан. Теперь давай начнем трансформацию класса LevelLoader в синглтон.
    Задание
    Первое действие - нужно добавить приватное статическое поле с именем instance типа LevelLoader в класс LevelLoader.
Это поле сразу инициализируй новым экземпляром LevelLoader (вызовом new LevelLoader()).
    Создай статический публичный метод LevelLoader getInstance(), который будет возвращать instance.

Примеры тестов
выполнение кода LevelLoader.getInstance().load("StartLevel") возвращает строку Loading level StartLevel ...;
выполнение кода LevelLoader.getInstance() == LevelLoader.getInstance() возвращает true, потому что метод getInstance() возвращает ссылку на один и тот же объект.
 */

class LevelLoader22 { //class LevelLoader
    private static LevelLoader22 instance = new LevelLoader22();

    public String load(String levelName) {
        return "Loading level " + levelName + " ...";
    }

    public static LevelLoader22 getInstance() {
        return instance;
    }
}

class Tasck22 { //class LevelLoaderTest
    public static void main(String[] args) {
        //Loading level Startlevel ...
        System.out.println(LevelLoader22.getInstance().load("StartLevel"));
        System.out.println(LevelLoader22.getInstance() == LevelLoader22.getInstance());
    }
}