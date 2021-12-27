package main.java;

/*
    Задача - спроектировать игровое меню
Удобно сделать это одним классом GameMenu с набором внутренних статических классов.
    Задача
    Создай класс GameMenu.
    В классе GameMenu создай внутренний статический абстрактный класс MenuItem.
    У класса MenuItem создай абстрактный метод getAction(), который возвращает строку.
    Создай три класса-наследника от класса MenuItem, которые реализуют метод getAction():
        класс Start, метод getAction() возвращает строку start;
        класс Options, метод getAction() возвращает строку options;
        класс Exit, метод getAction() возвращает строку exit.
    У класса GameMenu создай метод void act(MenuItem item). Этот метод принимает элемент меню (экземпляр
класса MenuItem), и выводит в консоль результат вызова метода getAction() у этого элемента.

Примеры тестов
Выполнение кода:

 GameMenu menu = new GameMenu();

//options
menu.act(new GameMenu.Options());

//start
menu.act(new GameMenu.Start());

//exit
menu.act(new GameMenu.Exit());
выводит в консоль:

options
start
exit
 */

class GameMenu {
    static abstract class MenuItem {
        abstract String getAction();
    }

    static class Start extends MenuItem {

        @Override
        String getAction() {
            return "start";
        }
    }

    static class Options extends MenuItem {

        @Override
        String getAction() {
            return "options";
        }
    }

    static class Exit extends MenuItem {

        @Override
        String getAction() {
            return "exit";
        }
    }

    void act(MenuItem item) {
        System.out.println(item.getAction());
    }
}

class Tasck20 { //class GameMenuTest
    public static void main(String[] args) {
        GameMenu menu = new GameMenu();

        //options
        menu.act(new GameMenu.Options());

        //start
        menu.act(new GameMenu.Start());

        //exit
        menu.act(new GameMenu.Exit());
    }
}