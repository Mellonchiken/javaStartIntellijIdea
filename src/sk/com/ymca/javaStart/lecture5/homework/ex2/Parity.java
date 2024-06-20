package sk.com.ymca.javaStart.lecture5.homework.ex2;

import java.util.Scanner;

/*
Відомо, що у парних чисел молодший біт має значення 0
Використовуючи IntelliJ IDEA, створіть клас Parity.
Напишіть програму, яка виконуватиме перевірку чисел на парність.
Запропонуйте два варіанти вирішення поставленого завдання.
 */
public class Parity {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = scan.nextInt();

        if ((number | 1) == number) {
            System.out.println("Unpair");
        } else {
            System.out.println("Pair");
        }

        if (number % 2 == 0) {
            System.out.println("Pair");
        } else {
            System.out.println("Unpair");
        }
    }
}
