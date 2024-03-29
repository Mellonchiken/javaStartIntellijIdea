package sk.com.ymca.javaStart.lecture1.homeWork;
/*
Є 3 змінні типу int x = 10, y = 12 і z = 3;
Виконайте та розрахуйте результат наступних арифметичних операцій для цих змінних:
 x += y - x++ * z;
 z = --x - y * 5;
 y /= x + 5% z;
 z = x++ + y * 5;
 x = y - x++ * z;
*/
public class OperationsWithVariables {
    public static void main(String[] args) {
        int x = 10, y = 12, z = 3;

        System.out.println(x += y - x++ * z);

        x = 10;
        y = 12;
        z = 3;

        System.out.println( z = --x - y * 5);

        x = 10;
        y = 12;
        z = 3;

        System.out.println( y /= x + 5% z);

        x = 10;
        y = 12;
        z = 3;

        System.out.println( z = x++ + y * 5);

        x = 10;
        y = 12;
        z = 3;

        System.out.println( x = y - x++ * z);

    }
}