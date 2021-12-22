package main.java;

/*
    Задание - сделать конструктор с параметрами
    Допиши в классе Hero конструктор, который принимает два параметра - имя главного героя, и число его жизней.
Задай полям name и hp значения этих параметров.

Не удаляй конструктор по умолчанию, он должен работать так же, как и работал раньше.

Примеры тестов
вызов new Hero().getName() возвращает Paratrooper;
вызов new Hero("Stranger", 50).getName() возвращает Stranger.
 */

class Hero02 { // class Hero
    private String name;
    private int hp;

    public Hero02() {
        name = "Paratrooper";
        hp = 100;
    }

    public Hero02(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }
}

class Tasck02 { //class HeroTest
    public static void main(String[] args) {
        Hero02 hero = new Hero02("Stranger", 50);

        //Expect Stranger
        System.out.println(hero.getName());

        //Expect 50
        System.out.println(hero.getHp());
    }
}