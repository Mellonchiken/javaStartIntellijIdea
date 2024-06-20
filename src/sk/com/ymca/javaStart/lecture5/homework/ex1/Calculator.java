package sk.com.ymca.javaStart.lecture5.homework.ex1;

import java.util.Scanner;

/*
Використовуючи IntelliJ IDEA, створіть клас Calculator.
Напишіть програму – консольний калькулятор.
Створіть дві змінні з іменами operand1 та operand2. Задайте змінним деякі
довільні значення. Запропонуйте ввести знак арифметичної операції. Прийміть
значення, введене користувачем, і помістіть його в рядкову змінну sign.
Для організації вибору алгоритму обчислювального процесу використовуйте перемикач switch.
Виведіть на екран результат виконання арифметичної операції.
У разі використання операції розподілу, організуйте перевірку спроби розподілу на нуль. І якщо
така є, то скасуйте виконання арифметичної операції та повідомите про помилку
користувача
*/
public class Calculator {
    public static void main(String[] args) {
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
                    System.out.println(number1 + number2);
                    break;
                }
                case "-": {
                    System.out.println(number1 - number2);
                    break;
                }
                case "/": {
                    if (number2 == 0) {
                        System.out.println("You can`t divide by 0.");
                } else {
                        System.out.println(number1 / number2);
                    }
                    break;
                }
                case "*": {
                    System.out.println(number1 * number2);
                    break;
                }
                default: {
                    System.out.println("I don`t understand you.");
                }
            }
        }
    }
}
