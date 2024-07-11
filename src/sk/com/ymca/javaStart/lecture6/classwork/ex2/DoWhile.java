package sk.com.ymca.javaStart.lecture6.classwork.ex2;

public class DoWhile {
    public static void main(String[] args) {
        int counter = 0;

        do {
            counter++;
            System.out.println("Counter is " + counter);
        }

        while (counter < 3);
    }
}