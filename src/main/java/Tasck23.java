package main.java;

/*
    Задание - завершаем синглтон
Ты написал уже почти готовый синглтон. Единственный момент - еще можно создать новые экземпляры
класса LevelLoader оператором new в стороннем коде.
    Задание
    Создай в классе LevelLoader приватный конструктор без параметров. Других конструкторов быть не должно.

Примеры тестов
выполнение кода LevelLoader.getInstance().load("StartLevel") возвращает строку Loading level StartLevel ...;
выполнение кода LevelLoader.getInstance() == LevelLoader.getInstance() возвращает true, потому что метод getInstance() возвращает ссылку на один и тот же объект;
код new LevelLoader() в других классах не компилируется.
 */

class LevelLoader23 {
    private static LevelLoader23 instance = new LevelLoader23();

    public static LevelLoader23 getInstance() {
        return instance;
    }

    public String load(String levelName) {
        return "Loading level " + levelName + " ...";
    }

    private LevelLoader23() {}
}

class Tasck23 { //class LevelLoaderTest
    public static void main(String[] args) {
        //Loading level Startlevel ...
        System.out.println(LevelLoader23.getInstance().load("StartLevel"));
        System.out.println(LevelLoader22.getInstance() == LevelLoader22.getInstance());
    }
}