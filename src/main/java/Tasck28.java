package main.java;

/*
    Задание - сделать рефакторинг
Класс TotalScore создан для подсчета общего количества заработанных игроком баллов.
Метод sum() принимает массив целых чисел (это баллы), суммирует их, и возвращает результат.

Код в принципе работает, но написан он... ну не очень хорошо. Он полагается на выбрасывание
исключения IndexOutOfBoundsException. Этот код совершенно точно нужно исправлять - делать рефакторинг.

Задание
Сделай рефакторинг метода sum() в классе TotalScore. Метод должен работать точно так же, как и работал,
но внутри метода не используй перехват исключения (ключевые слова try...catch).
Перепиши этот метод на нормально работающий Java-код.

Примеры тестов
выполнение кода new TotalScore().sum(new int[] {10, 20, 30}) возвращает 60;
внутри метода sum() нет использования ключевых слов try...catch.
 */

class TotalScore28 {
    public int sum(int[] scores) {
        int result = 0;
        //int index = 0;

        //while(true) {
        //    try {
        //        result += scores[index++];
        //    } catch (IndexOutOfBoundsException ex) {
        //        break;
        //    }
        //}

        for (int index : scores) {
            result += index;
        }
        return result;
    }
}

class Tasck28 { //class TotalScoreTest
    public static void main(String[] args) {
        int[] score = {10, 20, 100};

        //130
        System.out.println(new TotalScore28().sum(score));
    }
}