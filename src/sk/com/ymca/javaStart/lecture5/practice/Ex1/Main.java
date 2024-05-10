package sk.com.ymca.javaStart.lecture5.practice.Ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Addition addition = new Addition();
        Subtraction subtraction = new Subtraction();
        Multiplication multiplication = new Multiplication();
        Division division = new Division();

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double number1 = scan.nextDouble();

        System.out.println("Enter sign: ");
        String sign = scan.next();

        System.out.println("Enter second number: ");
        double number2 = scan.nextDouble();

        if (number2 == 0 && sign.equals("/")) {
            System.out.println("You can`t divide by 0.");
        } else {
            switch (sign) {
                case "+": {
                    addition.addition(number1, number2);
                    break;
                }
                case "-": {
                    subtraction.subtraction(number1, number2);
                    break;
                }
                case "/": {
                    if (number2 == 0) {
                        System.out.println("You can`t divide by 0.");
                    } else {
                        division.division(number1, number2);
                    }
                    break;
                }
                case "*": {
                    multiplication.multiplication(number1,number2);
                    break;
                }
                default: {
                    System.out.println("I don`t understand you.");
                }
            }
        }
    }
}
