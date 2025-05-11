package sk.com.ymca.javaStart.lecture8.classwork.extraTask;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean counter = true;
        while (counter) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the priority:");
            String priority = scan.next();

            System.out.println("Enter the text:");
            String text = scan.next();

            System.out.println("Enter the status:");
            String status = scan.next();

            WorkList task = new WorkList(priority, text, status);

            System.out.println("Press: 1 - new task, 2 - delete task, 3 - exit the program, 4 - show task information.");
            int choice = scan.nextInt();

            switch (choice) {
                case 1: {
                continue;
                }
                case 2: {
                task.delete();
                    System.out.println("Removed");
                    break;
                }
                case 3: {
                    counter = false;
                break;
                }
                case 4: {
                text.toString();
                counter = false;
                break;
                }
            }
        }
    }
}
