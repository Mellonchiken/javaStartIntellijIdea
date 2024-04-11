package sk.com.ymca.javaStart.lecture4.additional.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Methods object = new Methods();

        for (int i = 0; i < 1;) {
            System.out.println("Enter radius:");
            /*
            An object of class Scanner must be created just once in your code an object will be created each time
            when the loop starts.
            */
            Scanner scan = new Scanner(System.in); 
            double r = scan.nextDouble();

            System.out.println("Enter height:");
            double h = scan.nextDouble();
             /*
             You should ask a user what he wants to do at the beginning of the program.
             My advice to you: use a loop 'while', but you have to think about the user's exit.
            */
            System.out.println("What do you want to do: press 1 - square, press 2 - volume.");
            int choice1 = scan.nextInt();
            
            /*
             I've been thinking about 'switch' and decided that the construction 'if-else' will be better.
             You should change the construction to 'if-else'.
            */
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

            // All the codes below are redundant!
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
