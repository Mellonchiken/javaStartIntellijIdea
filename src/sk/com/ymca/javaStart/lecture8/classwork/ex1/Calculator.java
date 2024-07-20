package sk.com.ymca.javaStart.lecture8.classwork.ex1;

import sk.com.ymca.javaStart.lecture7.classwork.ex2.ArithmeticOperations;

import java.util.Scanner;

/*
Створити калькулятор на 4 арифметичні дії.(+, -, /, *)
4-и окремих метода на кожну дію.
 */
public class Calculator {
    public static void main(String[] args) {
        sk.com.ymca.javaStart.lecture7.classwork.ex2.ArithmeticOperations res = new ArithmeticOperations();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number:");
        int number1 = scan.nextInt();

        System.out.println("Enter arithmetic operand (+, -, *, /):");
        String operand = scan.next();

        System.out.println("Enter second number:");
        int number2 = scan.nextInt();

        int result = 0;

        switch (operand) {
            case "+": {
                System.out.println(res.add(number1, number2));
                break;
            }
            case "-": {
                System.out.println(res.sub(number1, number2));
                break;
            }
            case "*": {
                System.out.println(res.mul(number1, number2));
                break;
            }
            case "/": {
                try {
                    System.out.println(res.div(number1, number2));
                } catch (ArithmeticException e) {
                    System.out.println("Division by zero");
                } finally {
                 break;
                }
            }
            default: {
                System.out.println("Chose another operand");
            }
        }
    }
}
