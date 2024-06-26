package sk.com.ymca.javaStart.lecture5.homework.ex2;

import java.util.Scanner;

/*
Використовуючи IntelliJ IDEA, створіть клас Premium.
Напишіть програму розрахунку нарахування премій працівникам. Премії розраховуються згідно
вислугу років.
Якщо вислуга віком до 5 років, премія становить 10% від заробітної плати.
Якщо вислуга від 5 років (включно) до 10 років, то премія становить 15% від заробітної плати.
Якщо вислуга віком від 10 років (включно) до 15 років, премія становить 25% від заробітної плати.
Якщо вислуга віком від 15 років (включно) до 20 років, премія становить 35% від заробітної плати.
Якщо вислуга віком від 20 років (включно) до 25 років, премія становить 45% від заробітної плати.
Якщо вислуга від 25 років (включно) та більше, премія складає 50% від заробітної плати.
Результати розрахунку виведіть на екран.
 */
public class Premium {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your salary:");
        int salary = scan.nextInt();

        System.out.println("Enter your work experience:");
        int experience = scan.nextInt();
        double bonus = 0;

        if (experience < 5) {
            bonus = 0.1;
        } else if (experience < 10) {
            bonus = 0.15;
        } else if (experience < 15) {
            bonus = 0.25;
        } else if (experience < 20) {
            bonus = 0.35;
        } else if (experience < 25) {
            bonus = 0.45;
        } else if (experience >= 25) {
            bonus = 0.50;
        } else {
            System.out.println("Error");
        }

        System.out.println("Your bonus is " + salary * bonus);
    }
}
