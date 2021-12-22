package main.java;

/*
    Задание - валидировать поле hp
    Допиши конструктор Hero(String, int) так, чтобы он ограничивал значение поля hp диапазоном от 0 до 200 включительно.

Примеры тестов
вызов new Hero("Stranger", 250).getHp() возвращает 200
вызов new Hero().getHp() возвращает 100
 */

class Hero04 { //class Hero
    private String name;
    private int hp;

    public Hero04(String name, int hp) {
        this.name = name;
        if (hp < 0) {this.hp = 0;}
        else if (hp > 200) {this.hp = 200;}
        else {this.hp = hp;}
    }

    public Hero04() {
        this("Paratrooper", 100);
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }
}

class Tasck04 {  //class HeroTest
    public static void main(String[] args) {
        Hero04 hero = new Hero04("Stranger", 50);

        //Expect Stranger
        System.out.println(hero.getName());

        //Expect 50
        System.out.println(hero.getHp());


        //вызов new Hero("Stranger", 250).getHp() возвращает 200
        System.out.println(new Hero04("Stranger", 250).getHp());
    }
}