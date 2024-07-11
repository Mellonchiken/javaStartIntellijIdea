package sk.com.ymca.javaStart.lecture6.homework;
/*
Напишіть програму, яка виведе прямокутник з зірочок (*).
Розміри прямокутника: 5 рядків і 10
 */
public class Rectangle {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
