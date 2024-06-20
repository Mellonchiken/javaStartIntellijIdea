package sk.com.ymca.javaStart.lecture5.classwork.ex4;

public class Port {
    public static void main(String[] args) {
        byte port = 112;
        byte mask = 114;

        System.out.println("Port = " + port + " is off.");

        port = (byte) (port | mask);

        System.out.println("Port = " + port + " is on.");

        mask = 112;

        port = (byte) (port & mask);

        System.out.println("Port = " + port + " is off.");
    }
}