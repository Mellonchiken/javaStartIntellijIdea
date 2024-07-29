package sk.com.ymca.javaStart.lecture8.practice;

import java.util.Scanner;

/*
Виконати задачу за допомоги масивів та циклів.
Користувач вводить своє ім'я.
А отримує своє ж розділене ім'я на букви.
Приклад: Олександр — О л е к с а н д р
 */
public class WordSeparator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name:");
        String word = scan.next();

        char[] separatedWord = word.toCharArray();

        for (int i = 0; i < separatedWord.length; i++) {
            System.out.print(separatedWord[i] + " ");
        }
    }
}
