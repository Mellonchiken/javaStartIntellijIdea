package sk.com.ymca.javaStart.lecture1.homeWork;
/*
Створіть клас Arithmetic Average.
Обчисліть середнє арифметичне трьох цілих значень і виведіть його на екран.

- Проаналізуйте для себе:
З якою проблемою ви зіткнулися?
Який тип змінних краще використовувати для коректного
відображення результату?

*/
public class ArithmeticAverage {
    public static void main(String[] args) {
        double firstNumber = 2.4, secondNumber = 49.5, thirdNumber = 34.9; // first variation
        double arithmeticAverage = (firstNumber + secondNumber + thirdNumber) / 3;

        System.out.println(arithmeticAverage);

        System.out.println((20 + 21 + 64) / 3); // second variation
    } // first variation is better, because result is more accurate
}