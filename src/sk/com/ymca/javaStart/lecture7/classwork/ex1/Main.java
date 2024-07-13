package sk.com.ymca.javaStart.lecture7.classwork.ex1;

import java.util.Scanner;

/*
Використовуючи IntelliJ IDEA, створіть клас SumMin.
Дано два числа A та B (A<B) виведіть суму всіх чисел, розташованих між цими числами на екран.
———————————————————————————————————
Дано два числа A та B (A<B) виведіть усі непарні значення, розташовані між даними числами

1)Реалізація: це має бути окремий метод
2)Дано два числа A та B (A<B) виведіть усі непарні значення, розташовані між даними числами - це також окремий метод.
3) Обидва методи зберігаються у окремому класі
4) Реалізація методів відбувається в окремому класі Main,
 з використанням циклів та зрозумілого пояснення для користувача, через сканер.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number:");
        int number1 = scan.nextInt();

        System.out.println("Enter second number:");
        int number2 = scan.nextInt();

        Methods result = new Methods();

        System.out.println("Sum is " + result.sumMin(number1, number2) +
                '\n' + "Unpair numbers are " + result.unpairNumbers(number1, number2));
    }
}
