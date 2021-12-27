package main.java;

/*
    Задача - создать пул текстур
Еще один класс-синглтон для загрузки текстур.
    Полезно.
    Текстура - это термин из компьютерной графики, изображение которое выводится на экран. Именно текстуры в
играх занимают больше всего места на диске, и именно из-за текстур нужны гигабайты памяти в видеокартах.

    Задача
    Напиши класс-синглтон TexturePool. У этого класса должен быть метод public String getTexture(String textureName).
Этот метод возвращает строку Get texture <TEXTURE_NAME>. Вместо <TEXTURE_NAME> должно быть имя текстуры, которое
передается как параметр в метод getTexture().

Примеры тестов
выполнение кода TexturePool.getInstance().getTexture("MainHero") возвращает строку Get texture MainHero;
выполнение кода TexturePool.getInstance() == TexturePool.getInstance() возвращает true, потому что метод getInstance() возвращает ссылку на один и тот же объект;
код new TexturePool() в других классах не компилируется.
 */

class TexturePool24 {
    private static TexturePool24 instance = new TexturePool24();

    public static TexturePool24 getInstance() {
        return instance;
    }

    private TexturePool24() {}

    public String getTexture(String textureName) {
        return "Get texture " + textureName;
    }
}

class Tasck24 { //class TexturePoolTest
    public static void main(String[] args) {
        //Get texture MainHero
        System.out.println(TexturePool24.getInstance().getTexture("MainHero"));
    }
}