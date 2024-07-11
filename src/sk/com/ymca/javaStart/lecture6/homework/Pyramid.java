package sk.com.ymca.javaStart.lecture6.homework;
/*
Напишіть програму, яка виведе піраміду з чисел.
Кількість рядків: 5. Кожен рядок містить відповідне число, повторене кілька разів.
 */
public class Pyramid {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < i; ++j) {
                System.out.print(i);
            }

            System.out.println();
        }
    }
}
