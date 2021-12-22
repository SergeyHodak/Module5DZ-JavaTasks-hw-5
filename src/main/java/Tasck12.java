package main.java;

/*
    Задача - пересекаются ли два круга
Когда происходит взрыв гранаты в игре Quarke, урон от гранаты наносится всем предметам вокруг в определенном радиусе.

Каждый предмет, которому может быть нанесен урон, представляется тоже в виде круга.

Как итог, при взрыве гранаты нам нужно для каждого предмета вокруг понять, будет ли ему нанесен урон. А для этого нужно проверить, пересекаются ли два круга. Если пересекаются - значит, урон будет нанесен.

Задание
Напиши класс CircleIntersector. Создай у этого класса конструктор public CircleIntersector(int x1, int y1, int r1, int x2, int y2, int r2).

Параметры x1, y1, r1 - это координаты первого круга. Параметры x2, y2, r2 - это координаты второго круга.

Переопредели метод toString() так, чтобы он возвращал intersects, если круги пересекаются, и not intersects, если не пересекаются.

Примеры тестов
выполнение кода System.out.println(new CircleIntersector(0, 0, 2, 4, 0, 2)) выводит в консоль intersects;
выполнение кода System.out.println(new CircleIntersector(0, 0, 1, 4, 0, 2)) выводит в консоль not intersects;
выполнение кода System.out.println(new CircleIntersector(5, 5, 2, 8, 8, 2)) выводит в консоль not intersects.
 */

class Tasck12 { //class CircleIntersectorTest
    public static void main(String[] args) {
        //intersects
        System.out.println(new CircleIntersector(0, 0, 2, 4, 0, 2));

        //not intersects
        System.out.println(new CircleIntersector(0, 0, 1, 4, 0, 2));

        //not intersects
        System.out.println(new CircleIntersector(5, 5, 2, 8, 8, 2));
    }
}