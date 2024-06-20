package sk.com.ymca.javaStart.lecture5.classwork.ex4;

public class Encryption {
    public static void main(String[] args) {
        short secretKey = 5;
        char character = 'A';

        System.out.println("symbol: " + character + "code: " + (byte) character);

        character = (char) (character ^ secretKey);
        System.out.println("Symbol: " + character + ", code in the table: " + (byte) character);

        character = (char) (character ^ secretKey);
        System.out.println("Symbol: " + character + ", code in table: " + (byte) character);
    }
}
