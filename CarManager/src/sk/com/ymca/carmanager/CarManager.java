package sk.com.ymca.carmanager;

public class CarManager {
    public static void main(String[] args) {
        Car toyota = new Car("Toyota", "Prius", 15000, 1200, "green", "V8");

        toyota.addDistance(-700);

        System.out.println(toyota.getMark() + ", " + toyota.getModel() + ", " + toyota.getPrice() + ", " +
                toyota.getWeight() + ", " + toyota.getColor() + ", " + toyota.getEngine() + ", " + toyota.distance);
    }
}
