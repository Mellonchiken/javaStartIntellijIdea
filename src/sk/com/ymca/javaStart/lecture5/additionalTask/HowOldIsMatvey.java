package sk.com.ymca.javaStart.lecture5.additionalTask;

import java.util.Scanner;

public class HowOldIsMatvey {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Matvey was born in 1488. Enter the year: ");
        int year = scan.nextInt();

        System.out.println("Matvey is " + (year - 1488) + " years old.");
    }
}
