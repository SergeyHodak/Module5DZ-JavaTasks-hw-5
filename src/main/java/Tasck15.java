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

class TargetFinder15 {
    public int[] findTarget(int[] aiCoords, int[][] targets) {
        int[][] result = new int[][]{{-1}, {0, 0}}; //dist, coord
        for (int i = 0; i < targets.length; i++) {
            int a = targets[i][0] - aiCoords[0];
            int b = targets[i][1] - aiCoords[1];
            int dist = (int) Math.sqrt(a * a + b * b);
            if (i == 0){
                result[0][0] = dist;
                result[1][0] = targets[i][0];
                result[1][1] = targets[i][1];
            }
            if (result[0][0] > dist) {
                result[0][0] = dist;
                result[1][0] = targets[i][0];
                result[1][1] = targets[i][1];
            }
        }
        return result[1];
    }
}