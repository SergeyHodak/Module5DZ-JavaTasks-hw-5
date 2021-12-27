package main.java;

/*
Задача - залить код на github
    Задача
    Создай новый публичный github репозиторий, в названии которого есть текст hw-5.
    Добавь в корень репозитория файл uid.txt с твоим личным идентификатором (узнать его можно, написав боту слово uid).
    Также добавь в корень репозитория файл LevelLoaderTest.java, в котором будет исходный код решения предыдущей задачи.
    Отправь ссылку на репозиторий в редактор java-кода и нажми на кнопку "Проверить".
 */

class Tasck30 {}

/*
class Level {
    private int width;
    private int height;

    public Level(int width, int height) {
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

class LevelLoader {
    public void load(Level level) throws LevelTooBigException {
        RuntimeException result = (level.getHeight() * level.getWidth() > 100000) ? new IllegalArgumentException() : new RuntimeException();
        try {
            throw result;
        } catch (IllegalArgumentException e) {
            throw new LevelTooBigException();
        } catch (RuntimeException ignored) {
        }
        System.out.println("Level loaded");
    }
}

class LevelTooBigException extends Exception {
    LevelTooBigException() {}
}

class LevelLoaderTest {
    public static void main(String[] args) {
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
    }
}
 */