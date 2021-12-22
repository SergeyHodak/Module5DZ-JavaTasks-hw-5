package main.java;

/*
    Задание - посчитать квадраты чисел
Напиши статический блок инициализации, где массив POWER_2 инициализируется квадратами чисел от 1 до 10 включительно.
Используй именно статический блок инициализации, не обычный.

Примеры тестов
выполнение кода System.out.println(Arrays.toString(PowTable.POWERS_2)) выводит
в консоль текст [1, 4, 9, 16, 25, 36, 49, 64, 81, 100];
в коде класса PowTable есть только статический блок инициализации, нет конструкторов.
 */

import java.util.Arrays;

class PowTable08 {
    static {
        int[] a = new int[10];
        for (int i = 1, j = 0; i < 11; i++, j++) {
            a[j] = i*i;
        }
        POWERS_2 = a;
    }

    public static final int[] POWERS_2;
}

class Tasck08 { //class PowTableTest
    public static void main(String[] args) {
        //[1, 4, 9, 16, 25, 36, 49, 64, 81, 100]
        System.out.println(Arrays.toString(PowTable08.POWERS_2));
    }
}