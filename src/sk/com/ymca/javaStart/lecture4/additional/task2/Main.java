package sk.com.ymca.javaStart.lecture4.additional.task2;

import java.util.Scanner;

/*
 An object of class Scanner must be created just once in your code an object will be created each time
 when the loop starts.

 You should ask a user what he wants to do at the beginning of the program.
 My advice to you: use a loop 'while', but you have to think about the user's exit.

 I've been thinking about 'switch' and decided that the construction 'if-else' will be better.
 You should change the construction to 'if-else'.

 All the codes below are redundant!
*/
public class Main {
    public static void main(String[] args) {
        AreaAndVolumeOfCylinder object = new AreaAndVolumeOfCylinder();
        Scanner scan = new Scanner(System.in);

        System.out.println("Do you want to exit? - 'yes' or 'no'");
        String choice0 = scan.next();

/*
        if (choice0.equalsIgnoreCase("yes")) {
            System.exit(0);
        } else if (choice0.equalsIgnoreCase("no")) {
            System.out.println("Wait a second. Program will continue.");
        } else {
            System.out.println("I don`t understand what you mean. Program will exit.");
            System.exit(0);
        }

            for (int i = 0; i < 1; ) {
                ...
            }
*/ // my previous code variation
        while (choice0.equalsIgnoreCase("no")) {
            System.out.println("What do you want to do: press 1 - square, press 2 - volume, press any number - exit.");
            int choice1 = scan.nextInt();

            if (choice1 == 1) {
                System.out.println("Enter radius:");
                double r = scan.nextDouble();

                System.out.println("Enter height:");
                double h = scan.nextDouble();

                double square = object.square(r, h);
                System.out.println("Square = " + square);
            } else if (choice1 == 2) {
                System.out.println("Enter radius:");
                double r = scan.nextDouble();

                System.out.println("Enter height:");
                double h = scan.nextDouble();

                double volume = object.volume(r, h);
                System.out.println("Volume = " + volume);
            } else {
                choice0 = "GET OUT OF HERE!";
            }
        }
    }
}
