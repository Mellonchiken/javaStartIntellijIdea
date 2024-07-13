package sk.com.ymca.javaStart.lecture7.classwork.ex2;

import java.util.Scanner;

/*
Використовуючи IntelliJ IDEA, створіть клас Arithmetics.
Створіть чотири методи для виконання арифметичних операцій з іменами: add – додавання, sub –
віднімання, mul – множення, div – розподіл. Кожен метод повинен приймати два цілих
аргументу та виводити на екран результат виконання арифметичної операції відповідної
імені методу. Метод поділу div повинен виконувати перевірку спроби поділу на нуль.
Потрібно надати користувачеві можливість вводити з клавіатури значення операндів та знак
арифметичної операції, до виконання обчислень.
 */
public class Main {
    public static void main(String[] args) {
        ArithmeticOperations res = new ArithmeticOperations();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number:");
        int number1 = scan.nextInt();

        System.out.println("Enter arithmetic operand: (+, -, *, /)");
        String operand = scan.next();

        System.out.println("Enter second number:");
        int number2 = scan.nextInt();

        int result = 0;

        switch (operand) {
            case "+": {
                result = res.add(number1, number2);
                break;
            }
            case "-": {
                result = res.sub(number1, number2);
                break;
            }
            case "*": {
                result = res.mul(number1, number2);
                break;
            }
            case "/": {
                if (number2 != 0) result = res.div(number1, number2);
                else System.out.print("You can`t divide by ");
                break;
            }
            default: {
                System.out.println("Chose another operand.");
            }
        }

        System.out.println(result);
    }
}
