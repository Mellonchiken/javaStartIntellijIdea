package sk.com.ymca.javaStart.lecture7.classwork.ex1;

import java.util.ArrayList;

public class Methods {
    public int sumMin(int number1, int number2) {
        int result = 0;

        if (number2 > number1) {
            while (number2 > ++number1) {
                result += number1;
            }
        } else {
            while (number1 > ++number2) {
                result += number2;
            }
        }

        return result;
    }

    public ArrayList<Integer> unpairNumbers(int number1, int number2) {
        ArrayList<Integer> numbers = new ArrayList<>();

        if (number2 > number1) {
            for (int i = number1; i < number2; i++) {
                if (i % 2 == 1) numbers.add(i);
            }
        } else {
            for (int i = number2; i < number1; i++) {
                if (i % 2 == 1) numbers.add(i);
            }
        }

        return numbers;
    }
}

