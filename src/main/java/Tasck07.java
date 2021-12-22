package main.java;

/*
    Задание - разобраться, сохраняют ли игру
Теперь есть еще одна проблема. У тебя в коде есть класс GameSaver, который отвечает за сохранение игры.
Но игра почему-то не сохраняется. Ты подозреваешь, что сторонний код, написанный другими разработчиками,
даже не обращается к этому классу.

Тебе нужно понять, создается ли хоть раз объект класса GameSaver, чтобы копать дальше.
Для этого хорошо подойдет использование статического блока инициализации, который вызовется
лишь один раз - при первом создании объекта.

Задание
Допиши в классе GameSaver статический блок инициализации, чтобы при создании
первого объекта GameSaver в консоль выводился текст GameSaver created!.

Примеры тестов
Выполнение кода:

for(int i = 0; i < 10; i++) {
    new GameSaver();
}
выводит в консоль текст GameSaver created!.
 */

class Tasck07 { //class GameSaver
    static {
        System.out.println("GameSaver created!");
    }
}

class GameSaverTest07 { //class GameSaverTest
    public static void main(String[] args) {
        //GameSaver created!
        for(int i = 0; i < 10; i++) {
            new Tasck07();
        }
    }
}