package sk.com.ymca.javaStart.lecture6.homework;
/*
Напишіть програму, яка виведе таблицю Піфагора (таблиця множення)
для чисел від 1 до 10.
 */
public class PythagoreanTable {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + "*" + j + "=" + i * j);
            }

            System.out.println();
        }
    }
}
