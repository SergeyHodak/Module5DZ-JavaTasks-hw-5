package main.java;

/*
    Задача - бросить исключение при загрузке большого уровня
    Сейчас в игре есть загрузка уровней. Каждый уровень характеризируется размерами (ширина и высота).
Если попробовать загрузить слишком большой уровень, то игра вылетит из-за слишком большого потребления памяти.
    В этом случае при попытке загрузки слишком большого уровня нужно бросать проверяемое исключение.
Тогда клиентский код, пытающийся загрузить слишком большой уровень, будет обязан обработать это исключение.
И можно будет, например, вывести сообщение про ошибку вида Слишком большой уровень, нельзя загрузить.
    В коде уже есть описаны классы уровня Level, и загрузчика уровней LevelLoader. В классе LevelLoaderTest
описано ожидаемое поведение всей системы.

    Внимание. Сохрани код решения этой задачи, она пригодится тебе при решении следующей задачи.

Задание
    Создай свое проверяемое исключение с именем LevelTooBigException, унаследуясь от класса Exception.
    Бросай это исключение в методе load(Level level) класса LevelLoader если площадь
переданного уровня больше чем 100000 единиц.

Примеры тестов
Выполнение кода

//Level loaded
try {
    new LevelLoader().load(new Level(10, 20));
} catch (LevelTooBigException ex) {
    System.out.println("Level too big");
}

//Level too big
try {
    new LevelLoader().load(new Level(10000, 2000));
} catch (LevelTooBigException ex) {
    System.out.println("Level too big");
}
выводит в консоль

Level loaded
Level too big
 */

class Level29 {
    private int width;
    private int height;

    public Level29(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}

class LevelLoader29 {
    public void load(Level29 level) throws LevelTooBigException29 {
        RuntimeException result = (level.getHeight() * level.getWidth() > 100000) ? new IllegalArgumentException() : new RuntimeException();
        try {
            throw result;
        } catch (IllegalArgumentException e) {
            throw new LevelTooBigException29();
        } catch (RuntimeException ignored) {
        }
        System.out.println("Level loaded");
    }
}

class LevelTooBigException29 extends Exception {
    LevelTooBigException29() {}
}

class Tasck29 { //class LevelLoaderTest
    public static void main(String[] args) {
        //Level loaded
        try {
            new LevelLoader29().load(new Level29(10, 20));
        } catch (LevelTooBigException29 ex) {
            System.out.println("Level too big");
        }

        //Level too big
        try {
            new LevelLoader29().load(new Level29(10000, 2000));
        } catch (LevelTooBigException29 ex) {
            System.out.println("Level too big");
        }
    }
}