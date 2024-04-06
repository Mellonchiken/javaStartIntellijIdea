package sk.com.ymca.javaStart.lecture4.additional.task1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number:");
        double firstNumber = scan.nextDouble();

        System.out.println("Enter second number:");
        double secondNumber = scan.nextDouble();

        System.out.println("Enter third number:");
        double thirdNumber = scan.nextDouble();

        double arithmeticAverage = ArithmeticAverage.average(firstNumber, secondNumber, thirdNumber);

        System.out.println(arithmeticAverage);
    }
}
