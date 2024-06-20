package sk.com.ymca.javaStart.lecture5.homework.ex1;

import java.util.Scanner;

/*
 Використовуючи IntelliJ IDEA, створіть клас Interval.
Напишіть програму визначення, чи попадає вказане користувачем число від 0 до 100 у числовій
проміжок [0 – 14] [15 – 35] [36 – 50] [50 – 100]. Якщо так, то вкажіть, який саме проміжок. Якщо
користувач вказує число, що не входить до жодного з наявних числових проміжків, то
виводиться відповідне повідомлення.
 */
public class Interval {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scan.nextInt();

        if (number >= 0 && number <= 14) {
            System.out.println("Your number is between 0 and 14");
        } else if (number >= 15 && number <= 35) {
            System.out.println("Your number is between 15 and 35");
        } else if (number >= 36 && number <= 50) {
            System.out.println("Your number is between 36 and 50");
        } else if (number >= 50 && number <= 100) {
            System.out.println("Your number is between 50 and 100");
        } else {
            System.out.println("The number does not belong to any interval.");
        }
    }
}
