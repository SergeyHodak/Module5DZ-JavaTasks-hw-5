package main.java;

/*
    Задание - создать класс Hero
    Напиши класс для описания главного героя игры - Hero. У этого класса должны быть два поля:
        поле name строкового типа. В этом поле будет храниться имя главного героя;
        поле hp типа int. Здесь будет храниться количество оставшихся очков здоровья.
    В классе Hero также допиши конструктор без параметров, который будет инициализировать
поле name значением "Paratrooper", а поле hp - значением 100.
    Для полей name и hp напиши геттеры, сеттеры писать необязательно.

Примеры тестов
выполнение кода new Hero().getName() возвращает Paratrooper;
выполнение кода new Hero().getHp() возвращает 100
поля name и hp инициализируются в конструкторе
 */
class Tasck01 { // class HeroTest
    public static void main(String[] args) {
        Hero01 hero = new Hero01();

        //Expect Paratrooper
        System.out.println(hero.getName()); //Paratrooper

        //Expect 100
        System.out.println(hero.getHp()); //100
    }
}

class Hero01 {
    private String name; // имя главного героя
    private int hp; // количество оставшихся очков здоровья

    public Hero01() { //конструктор без параметров
        this.name = "Paratrooper";
        this.hp = 100;
    }

    public String getName() {
        return this.name;
    }

    public int getHp() {
        return this.hp;
    }

    //
}