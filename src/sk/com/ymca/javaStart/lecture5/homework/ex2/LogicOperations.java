package sk.com.ymca.javaStart.lecture5.homework.ex2;
/*
Використовуючи IntelliJ IDEA, створіть клас LogicOperations.
Є 3 змінні типу int x = 5, y = 10 і z = 15;
Виконайте та розрахуйте результат наступних операцій для цих змінних:
 x += y >> x++ * z;
 z = ++x & y * 5;
 y /= x + 5 | z;
 z = x++ & y * 5;
 x = y << x++ ^ z;
 */
public class LogicOperations {
    public static void main(String[] args) {
        int x = 5, y = 10, z = 15;

        x += y >> x++ * z;
        System.out.println(x);
        x = 5;
        y = 10;
        z = 15;

        z = ++x & y * 5;
        System.out.println(z);
        x = 5;
        y = 10;
        z = 15;

        y /= x + 5 | z;
        System.out.println(y);
        x = 5;
        y = 10;
        z = 15;

        z = x++ & y * 5;
        System.out.println(z);
        x = 5;
        y = 10;
        z = 15;

        x = y << x++ ^ z;
        System.out.println(x);
        x = 5;
        y = 10;
        z = 15;
    }
}
