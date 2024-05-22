package sk.com.ymca.javaStart.lecture5.additionalTask;

import java.util.ArrayList;
import java.util.Scanner;

public class EvaluationSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> grade = new ArrayList<>();

        int counter = 0;
        double sum = 0;
        String letter = "F";

        while (true) {
            System.out.println("Enter the number between 0 and 100. If you don`t want to continue, enter '-1'.");
            int number = scan.nextInt();

            if (number < 0 || number > 100) {
                break;
            }

            grade.add(counter++, number);
        }

        for (int i = 0; i < grade.size(); i++) {
            sum += grade.get(i);
        }

        double average = sum / grade.size();

        if (average <= 34) {
            letter = "F";
        } else if (average <= 59) {
           letter = "FX";
        } else if (average <= 63) {
            letter = "E";
        } else if (average <= 74) {
            letter = "D";
        } else if (average <= 81) {
            letter = "C";
        } else if (average <= 89) {
            letter = "B";
        } else if (average <= 100) {
            letter = "A";
        }

        System.out.println("Your average is: " + average + ", it`s " + letter);
    }
}
