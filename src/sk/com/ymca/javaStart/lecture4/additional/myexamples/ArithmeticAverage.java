package sk.com.ymca.javaStart.lecture4.additional.myexamples;

import java.util.ArrayList;

public class ArithmeticAverage {
    public static double average(int index, ArrayList numbers) {
        double sum = 0;

        for (int i = 0; i < index; i++) {
            sum += (double) (numbers.get(i));
        }

        return  sum / index;
    }
}