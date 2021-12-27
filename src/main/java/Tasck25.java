package main.java;

/*
    Задача - исправить код подсчета среднего значения
Написание игры подходит к концу, и осталось исправить баги.
Их достаточно много, это важная часть работы программиста, так что начнем.
    Первый баг был обнаружен в методе, который считает средний урон, который нанес игрок.
Этот метод принимает массив нанесенных уронов на протяжении игры, и считает среднее арифметическое.
    Проблема в том, что если массив уронов пустой (игрок ни разу не выстрелил), то возникает деление на 0,
и выбрасывается исключение, программа завершается с ошибкой.

    Задача
    Исправь класс AvgDamageCalculator, дописав метод calculateAvg() так, чтобы если мы передаем пустой массив и
происходит деление на 0, то эта исключительная ситуация обработалась, и метод возвратил значение 0.
    Не используй условные операторы if, используй именно обработку исключений try...catch.

Примеры тестов
вызов new AvgDamageCalculator().calculateAvg(new int[] {2, 4, 6, 8}) возвращает 5;
вызов new AvgDamageCalculator().calculateAvg(new int[0]) возвращает 0;
 */

class AvgDamageCalculator25 {
    public int calculateAvg(int[] samples) {
        int sum = 0;
        for(int sampleValue: samples) {
            sum += sampleValue;
        }

        try {
            return sum / samples.length;
        } catch (ArithmeticException чеУгодно) {
            return 0;
        }

    }
}

class Tasck25 { //class AvgDamageCalculatorTest
    public static void main(String[] args) {
        //5
        System.out.println(new AvgDamageCalculator25().calculateAvg(new int[] {2, 4, 6, 8}));

        //0
        System.out.println(new AvgDamageCalculator25().calculateAvg(new int[0]));
    }
}