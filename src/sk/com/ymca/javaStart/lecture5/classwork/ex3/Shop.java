package sk.com.ymca.javaStart.lecture5.classwork.ex3;

import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {
        System.out.println(
                "How many products do you want to buy (if you buy more than 10 products, you will get 10% discount)?"
        );
        Scanner scan = new Scanner(System.in);
        int quantity = scan.nextInt();
        int price = 12;

        double total = (quantity >= 10) ? price * 0.75 * quantity : price * quantity;

        System.out.println(total);
    }
}
