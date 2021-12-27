package main.java;

/*
    Задание - дописать блок finally
В недрах игры есть класс ArrayWorker, у которого есть метод printElement().
Метод принимает массив целых чисел, и индекс элемента, который нужно вывести.

Дело в том, что иногда в этот метод передаются неверные данные, и переданный индекс больше допустимого.
Тогда вылетает исключение ArrayIndexOutOfBoundsException, и программа опять-таки аварийно завершается.

Задание
Допиши метод printElement() в классе ArrayWorker так, чтобы:
    если переданный индекс меньше размера массива, и элемент можно получить - в консоль выводился бы этот элемент;
    если индекс неправильный, и бросается исключение - в консоль выводился бы текст wrong index;
в любом случае в конце еще бы выводилась строка index is <INDEX_VALUE>, где вместо <INDEX_VALUE> подставлялся бы переданный индекс.
Не используй условный оператор, лишь try...catch...finally.

Примеры тестов
Выполнение кода

int[] array = {1, 2, 3};

//value is 1
//index is 0
new ArrayWorker().printElement(array, 0);

//wrong index
//index is 10
new ArrayWorker().printElement(array, 10);
 */

class ArrayWorker26 {
    public void printElement(int[] array, int index) {
        try {
            System.out.println("value is " + array[index]);
        } catch (ArrayIndexOutOfBoundsException  e) {
            System.out.println("wrong index");
        } finally {
            System.out.println("index is " + index);
        }
    }
}

class Tasck26 { //class ArrayWorkerTest
    public static void main(String[] args) {
        int[] array = {1, 2, 3};

        //value is 1
        //index is 0
        new ArrayWorker26().printElement(array, 0);

        //wrong index
        //index is 10
        new ArrayWorker26().printElement(array, 10);
    }
}