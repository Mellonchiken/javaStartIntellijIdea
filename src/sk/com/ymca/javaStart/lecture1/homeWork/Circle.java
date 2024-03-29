package sk.com.ymca.javaStart.lecture1.homeWork;

import java.util.Scanner;

/*
Створіть клас Circle.
Створіть константу під назвою PI (число π «пі»), створіть змінну радіус з назвою – r. Використовуючи
формулу πR2, обчисліть площу кола та виведіть результат на екран.
*/
public class Circle {
    public static void main(String[] args) {
        final double PI = 3.1415926535897;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter radius of the circle:");
        int r = scan.nextInt();

        System.out.println(PI * Math.pow(r, 2));
    }
}
