package main.java;

/*
    Задача - равны ли треки
    Одинаковое количество игровых шагов, начисляется приз EqRunner.
Тебе нужно написать код, который определял бы для двух игроков, пробежали ли они одинаковое игровое расстояние за раунд.
    Задание
    Напиши класс QuarkeTrack, у которого есть конструктор public QuarkeTrack(int[] lines).
Это конструктор принимает массив из целых чисел. Каждое целое число - это длина пробежки игрока.
Пробежка игрока за раунд - это сумма всех отдельных пробежек.
    Переопредели метод equals(), чтобы объекты QuarkeTrack с одинаковой длиной пробежки игрока за раунда
возвращали true при сравнении их методом equals().
    Также переопредели метод hashCode(). Можешь использовать Objects.hash() (тогда не забудь импортировать
этот класс из пакета java.util). Необязательно использовать именно этот метод, но он весьма удобен.

Примеры
Выполнение кода

int[] track1Data = {1, 3, 5};
int[] track2Data = {3, 5, 4};
int[] track3Data = {1, 5, 3};

QuarkeTrack track1 = new QuarkeTrack(track1Data);
QuarkeTrack track2 = new QuarkeTrack(track2Data);
QuarkeTrack track3 = new QuarkeTrack(track3Data);

//false
System.out.println(track1.equals(track2));

//true
System.out.println(track1.equals(track3));

//Can be true or false
System.out.println(track1.hashCode() == track2.hashCode());

//true
System.out.println(track1.hashCode() == track3.hashCode());
выведет в консоль

false
true
false
true
Треки track1 и track3 равны, потому что сумма длин отрезков у них равна - 9.
 */

import java.util.Arrays;

class Tasck13 { // class QuarkeTrackTest
    public static void main(String[] args) {
        int[] track1Data = {1, 3, 5};
        int[] track2Data = {3, 5, 4};
        int[] track3Data = {1, 5, 3};

        QuarkeTrack13 track1 = new QuarkeTrack13(track1Data);
        QuarkeTrack13 track2 = new QuarkeTrack13(track2Data);
        QuarkeTrack13 track3 = new QuarkeTrack13(track3Data);

        //false
        System.out.println(track1.equals(track2));

        //true
        System.out.println(track1.equals(track3));

        //Can be true or false
        System.out.println(track1.hashCode() == track2.hashCode());

        //true
        System.out.println(track1.hashCode() == track3.hashCode());
    }
}

class QuarkeTrack13 {
    private int sum;

    public QuarkeTrack13(int[] lines) {
        this.sum = Arrays.stream(lines).sum();
    }

    //@Override
    //public String toString() {
    //    return this.sum + "";
    //}

    //@Override
    //public boolean equals(Object o) {
    //    if (o == null) return false;
    //    return (o).equals(this.sum);
    //}

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        QuarkeTrack13 dd = (QuarkeTrack13) o;
        return dd.sum == this.sum;
    }

    @Override
    public int hashCode() {
        return sum;
    }
}