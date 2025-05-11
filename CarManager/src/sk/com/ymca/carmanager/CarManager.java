package sk.com.ymca.carmanager;

public class CarManager {
    public static void main(String[] args) {
        Car toyota = new Car("Prius", 2012, 13500, 1350, "Wh#*ite");

        Car renault = new Car("Laguna", 2006, 10850, 1720, "Blue");

        Motorcycle suzuki = new Motorcycle(
                "SuzukiGSX-R1000", 2021, 16000, 600,
                "Black", "Diesel", true
        );

        Motorcycle yamaha = new Motorcycle(
                "YamahaFZ1", 2007, 9000, 700, "Orange", "Gas", false
        );

        System.out.println(toyota + "\n" + renault + "\n" + suzuki + "\n" + yamaha);
    }
}