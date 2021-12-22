package main.java;

/*
    Задача - описать класс Gun
    B нашей игре Quarke должна быть большая пушка с кодовым названием BFG.
    У этого оружия есть следующие параметры:
        количество патронов (по умолчанию 1000);
        урон (по умолчания 50);
        имя (по умолчанию BFG, но пользователь может назвать ее и по другому).
Для удобной работы с такими объектами можно использовать либо паттерн Строитель (до этого доберемся позже), либо же телескопический конструктор.

В случае телескопического конструктора мы создаем конструктор со всеми параметрами.

Дале создаем серию конструкторов, у каждого на один параметр меньше. Внутри этих конструкторов используем this для вызова уже описанных конструкторов.

Вот как это выглядит на примере класса с двумя параметрами:

class MinMaxValidator {
    private int min;
    private int max;

    public MinMaxValidator(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public MinMaxValidator(int min) {
        this(min, 100);
    }

    public MinMaxValidator() {
        this(0, 100);
    }

    public boolean isValid(int value) {
        return value >= min && value <= max;
    }
}
Задание
    Создай класс BFG, у которого будет три поля:
        int ammo - здесь хранятся патроны, по умолчанию 1000;
        int damage - здесь хранится наносимый оружием урон, по умолчанию 50;
        String name - здесь хранится имя оружия, по умолчанию BFG.
    Создай геттеры для каждого поля.

    У класса должно быть 4 конструктора:
        BFG(int ammo, int damage, String name) - задаем значения всем параметрам;
        BFG(int ammo, int damage) - задаем значения лишь двух параметров, количества патронов и урон, поле name инициализируется значением по умолчанию;
        BFG(int ammo) - задаем значение лишь количества патронов, урон и имя инициализируется по умолчанию;
        BFG() - конструктор без параметров, здесь полям ammo, damage и name задаются значения по умолчанию.
    Также переопредели метод toString(), чтобы он возвращал для класса BFG строку в формате <NAME>, ammo: <AMMO>, damage: <DAMAGE>. Вместо <NAME>, <AMMO>, <DAMAGE> подставляются значения полей name, value и damage.

Примеры тестов
вызов System.out.println(new BFG(10000, 300, "ExtraGun")) выводит в консоль ExtraGun, ammo: 10000, damage: 300;
вызов System.out.println(new BFG(5000, 200)) выводит в консоль BFG, ammo: 5000, damage: 200;
вызов System.out.println(new BFG(2000)) выводит в консоль BFG, ammo: 2000, damage: 50;
вызов  System.out.println(new BFG()) выводит в консоль BFG, ammo: 1000, damage: 50;
 */

class Tasck05 { //class BfgTest
    public static void main(String[] args) {
        //ExtraGun, ammo: 10000, damage: 300
        System.out.println(new BFG05(10000, 300, "ExtraGun"));

        //BFG, ammo: 5000, damage: 200
        System.out.println(new BFG05(5000, 200));

        //BFG, ammo: 2000, damage: 50
        System.out.println(new BFG05(2000));

        //BFG, ammo: 1000, damage: 50
        System.out.println(new BFG05());

    }
}

class BFG05 {
    private int ammo; //здесь хранятся патроны, по умолчанию 1000
    private int damage; //здесь хранится наносимый оружием урон, по умолчанию 50;
    private String name; //здесь хранится имя оружия, по умолчанию BFG.

    public BFG05(int ammo, int damage, String name) {
        //задаем значения всем параметрам
        this.ammo = ammo;
        this.damage = damage;
        this.name = name;
    }

    public BFG05(int ammo, int damage) {
        //задаем значения лишь двух параметров, количества патронов и урон, поле name инициализируется значением по умолчанию;
        this(ammo,damage, "BFG");
    }

    public BFG05(int ammo) {
        //задаем значение лишь количества патронов, урон и имя инициализируется по умолчанию;
        this(ammo,50, "BFG");
    }

    public BFG05() {
        //конструктор без параметров, здесь полям ammo, damage и name задаются значения по умолчанию.
        this(1000, 50, "BFG");
    }

    public int getAmmo() {
        return ammo;
    }

    public int getDamage() {
        return damage;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + ", ammo: " + ammo + ", damage: " + damage;
    }
}