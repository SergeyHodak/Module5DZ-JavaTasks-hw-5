package main.java;

/*
    Задача - поиск ближайшей цели
Когда компьютерный противник выбирает цель для атаки, он выбирает ближайшую цель.
    Задача
    Напиши класс TargetFinder. Этот класс имеет метод public int[] findTarget(int[] aiCoords, int[][] targets).
Этот метод принимает два параметра:
aiCoords - координаты точки, где сейчас находится ИИ. Это массив из двух элементов, x и y соответственно;
targets - двумерный массив. Каждый элемент массива - это массив из двух элементов, x и y потенциальной цели соответственно.
Метод возвращает точку ближайшей цели из массива targets. Это массив из двух точек - x и y соответственно.

Примеры тестов
Выполнение кода:

int[] aiCoords = {10, 10};
int[][] targets = {
        {20, 20},
        {15, 14},
        {30, 5}
};

TargetFinder targetFinder = new TargetFinder();
int[] nearestTarget = targetFinder.findTarget(aiCoords, targets);

//Expect [15, 14]
System.out.println(Arrays.toString(nearestTarget));
выводит в консоль [15, 14]
 */

import java.util.Arrays;

class Tasck15 { //class TargetFinderTest
    public static void main(String[] args) {
        int[] aiCoords = {10, 10};
        int[][] targets = {
                {20, 20},
                {15, 14},
                {30, 5}
        };

        TargetFinder15 targetFinder = new TargetFinder15();
        int[] nearestTarget = targetFinder.findTarget(aiCoords, targets);

        //Expect [15, 14]
        System.out.println(Arrays.toString(nearestTarget));
    }
}

//class TargetFinder15 { //мое рабочее решение
//    public int[] findTarget(int[] aiCoords, int[][] targets) {
//        int[][] result = new int[][]{{-1}, {0, 0}}; //dist, coord
//        for (int i = 0; i < targets.length; i++) {
//            int a = targets[i][0] - aiCoords[0];
//            int b = targets[i][1] - aiCoords[1];
//            int dist = (int) Math.sqrt(a * a + b * b);
//            if (i == 0){
//                result[0][0] = dist;
//                result[1][0] = targets[i][0];
//                result[1][1] = targets[i][1];
//            }
//            if (result[0][0] > dist) {
//                result[0][0] = dist;
//                result[1][0] = targets[i][0];
//                result[1][1] = targets[i][1];
//            }
//        }
//        return result[1];
//    }
//}

/*

class TargetFinder { //Гузий Анна 05.01.2022
    public int[] findTarget(int[] aiCoords, int[][] targets){
        int a = aiCoords[0]; //координата ИИ
        int b = aiCoords[1]; //координата ИИ
        int[] result = new int[0]; //создала пусто массив интов
        for (int i = 0; i < targets.length; i++) { //пробежка по противникам
            int aT = targets[i][0]; //координата икс противника
            int bT = targets[i][1]; //координата игрик противника
            int a1 = aT - a; //от икс противника отнять икс ИИ
            int b1 = bT - b; //от игрик противника отнять игрик ИИ

            //далее пошли неправильные действия
            if(a > a1 && b > b1) { // если координата икс ИИ больше чем растояние по икс к противнику, и тоже самое по игрику
                result = targets[i]; // в результат запихать эти координаты противника
                return result; //отдать результат
            }
        }
        return result; // отдать результат
    }
}

 */

/*

class TargetFinder { //Гузий Анна 05.01.2022
    public int[] findTarget(int[] aiCoords, int[][] targets){
        int xCoord = aiCoords[0]; //координата ИИ
        int yCoord = aiCoords[1]; //координата ИИ
        int[] result = new int[0]; //создала пусто массив интов
        for (int i = 0; i < targets.length; i++) { //пробежка по противникам
            int xTarget = targets[i][0]; //координата икс противника
            int yTarget = targets[i][1]; //координата игрик противника
            int XY = (int)Math.ceil((int) Math.hypot(xTarget - xCoord, yTarget - yCoord)); //нашла гипотенузу и округлила к целому в большую сторону

            //далее пошли не правильные действия
            if(xCoord >= XY && yCoord >= XY) { // если координата икс ИИ >= чем растояние и тоже самое по игрику
                result = targets[i]; // в результат запихать эти координаты противника
                return result; //отдать результат
            }
        }
        return result; //отдать результат
    }
}

 */
class TargetFinder15 { // вариант решения от Oleg bukshanevych 05.01.2022
    public double distance(int[] a, int[] b){
        if(a.length != b.length)  //если количество координат ИИ не равно количеству координат противника
            return -1.0; // вернуть дефолт = ошибке
        return Math.sqrt( ((b[0] - a[0]) * (b[0] - a[0])) + ((b[1] - a[1]) * (b[1] - a[1])) ); //ошибка нужно катеты суммировать, а не умножать
        // возврящает значение корня из (<икс противника> - <икс ИИ>)*(<икс противника> - <икс ИИ>) *
        // * ((<игрик противника> - <игрик ИИ>) * (<игрик противника> - <игрик ИИ>))
    }

    public int[] findTarget(int[] aiCoords, int[][] targets){
        double minimalLength = Double.MAX_VALUE; // создал переменную типа дубл, и присвоил ей максимальное значение этого типа
        int index = 0; // создал переменную типа инт, и присвоил ей нуль.
        int minDistantTarget = -1; // создал переменную типа инт, и присвоил ей значение -1.
        for (int[] target: targets) { // пробежка по противникам
            double dist = distance(aiCoords, target); // создел переменну типа дубл, и присвоил ей вызов метода дистанции
            if( dist <= minimalLength){ // если дистанция меньше равно максимального значения типа дубл
                minDistantTarget = index; // в переменную минДистанция записываем первую позицию = индекс 0
                minimalLength = dist; // в переменную записывает эту дистанцию в место максимального дубл
            }
            index ++; //повышает шаг
        }
        return Arrays.copyOf(targets[minDistantTarget], 2); // отдает комию массива с индекса в два значения
    }
}