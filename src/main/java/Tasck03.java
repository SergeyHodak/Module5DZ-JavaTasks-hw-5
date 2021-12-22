package main.java;

/*
    Задание - сделать рефакторинг
    Сделай рефакторинг кода. Перепиши конструктор Hero() без параметров так, чтобы он вызывал
конструктор Hero(String, int) с параметрами, используя ключевое слово this.

В остальном поведение программы не должно измениться.

Примеры тестов
вызов new Hero().getName() возвращает Paratrooper;
вызов new Hero("Stranger", 50).getName() возвращает Stranger.
в конструкторе без параметров вызывается конструктор с параметрами, используя ключевое слово this
 */

class Hero03 { //class Hero
    private String name;
    private int hp;

    public Hero03(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public Hero03() {
        this("Paratrooper", 100);
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }
}

class Tasck03 {  // class HeroTest
    public static void main(String[] args) {
        Hero03 hero = new Hero03("Stranger", 50);

        //Expect Stranger
        System.out.println(hero.getName());

        //Expect 50
        System.out.println(hero.getHp());
    }
}