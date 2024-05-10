package sk.com.ymca.javaStart.lecture5.classwork.ex1;

import java.util.Scanner;

public class Authentication {
    public static void main(String[] args) {
        System.out.println("Enter username:");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();

        String trueUserName = "MaksimMeln";
        String truePassword = "merti33456";
        if (name.equals(trueUserName)) {
            System.out.println("Enter password:");
            String password = scan.next();

            if (password.equals(truePassword)) {
                System.out.println("Verified");
            } else {
                System.out.println("Password incorrect");
            }
        } else {
            System.out.println("Username incorrect");
        }
    }
}
