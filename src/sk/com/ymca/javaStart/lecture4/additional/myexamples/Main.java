package sk.com.ymca.javaStart.lecture4.additional.myexamples;

import sk.com.ymca.javaStart.lecture4.additional.myexamples.ArithmeticAverage;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers do you want to find the average from?");
        int index = scan.nextInt();

        ArrayList numbers = new ArrayList(index);

        for (int i = 0; i < index; i++) {
            System.out.println("Enter the number:");
            numbers.add(scan.nextDouble());
        }

        double arithmeticAverage = ArithmeticAverage.average(index, numbers);

        System.out.println(arithmeticAverage);
    }
}
