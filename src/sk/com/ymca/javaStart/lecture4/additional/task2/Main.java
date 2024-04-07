package sk.com.ymca.javaStart.lecture4.additional.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Methods object = new Methods();

        for (int i = 0; i < 1;) {
            System.out.println("Enter radius:");
            Scanner scan = new Scanner(System.in);
            double r = scan.nextDouble();

            System.out.println("Enter height:");
            double h = scan.nextDouble();

            System.out.println("What do you want to do: press 1 - square, press 2 - volume.");
            int choice1 = scan.nextInt();

            switch (choice1) {
                case 1:
                    double square = object.square(r, h);
                    System.out.println("Square = " + square);
                    break;
                case 2:
                    double volume = object.volume(r, h);
                    System.out.println("Volume = " + volume);
                    break;
                default:
                    break;
            }

            System.out.println("Do you want to continue: press 1 - continue, press 2 - exit.");
            int choice2 = scan.nextInt();

            if (choice2 == 1) {
                continue;
            }else if (choice2 == 2) {
                break;
            }else {
                break;
            }
        }
    }
}
