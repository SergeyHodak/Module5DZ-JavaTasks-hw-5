package main.java;

/*
    Задание - бросить исключение
Следующий неприятный баг связан с компьютерными противниками.
У каждого из них есть очки жизни, и их не должно быть меньше 0 или больше 100.
В текущем коде можно задать значения, выходящие за этот диапазон, и тогда программа ведет себя непредсказуемым образом,
и ошибка проявляется позже. Лучше сразу бросать исключение и завершать программу, если кто-то передал неправильное
значение в сеттер.

Задание
Допиши метод setHp() в классе AIPlayer так, чтобы если значение переданного параметра hp было меньше 0 или больше 100,
то бросалось бы исключение IllegalArgumentException.

Примеры тестов
Выполнение кода

AIPlayer player = new AIPlayer();

//Ok value
try {
    player.setHp(50);
    System.out.println("Ok value");
} catch (IllegalArgumentException e) {
    System.out.println("Invalid value");
}

//Invalid value
try {
    player.setHp(-1);
    System.out.println("Ok value");
} catch (IllegalArgumentException e) {
    System.out.println("Invalid value");
}
выводит в консоль

Ok value
Invalid value
 */

class AIPlayer27 {
    private int hp;

    public void setHp(int hp) {
        RuntimeException result = (hp < 0 | hp > 100) ? new IllegalArgumentException() : new RuntimeException();
        try {
            throw result;
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (RuntimeException ignored) {
            //this.hp = hp;
        }
        //Java. как задать условие, для того, чтобы бросалось исключение
        //https://question-it.com/questions/158929/brosat-iskljuchenija-bez-ispolzovanija-if-java
    }
}

class Tasck27 { //class AIPlayerTest
    public static void main(String[] args) {
        AIPlayer27 player = new AIPlayer27();

        //Ok value
        try {
            player.setHp(50);
            System.out.println("Ok value");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid value");
        }

        //Invalid value
        try {
            player.setHp(-1);
            System.out.println("Ok value");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid value");
        }
    }
}