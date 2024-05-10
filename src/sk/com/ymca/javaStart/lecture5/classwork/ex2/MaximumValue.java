package sk.com.ymca.javaStart.lecture5.classwork.ex2;

import java.util.Scanner;

public class MaximumValue {
    public static void main(String[] args) {

        System.out.println("Enter first number:");
        Scanner scan = new Scanner(System.in);
        int number1 = scan.nextInt();

        System.out.println("Enter second number:");
        int number2 = scan.nextInt();

        int max = (number1 > number2) ? number1 : number2;
        System.out.println(max);
    }
}
