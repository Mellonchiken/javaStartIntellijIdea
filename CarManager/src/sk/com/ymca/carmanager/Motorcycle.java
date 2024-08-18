package sk.com.ymca.carmanager;

public class Motorcycle {
    String model;
    int year;
    int price;
    int weight;
    Color color;
    String engineType;
    boolean isReadyToDrive;

    public Motorcycle(String model, int year, int price, int weight, String color, String engineType, boolean isReadyToDrive) {
        this.model = model;
        this.year = year;
        this.price = price;
        this.weight = weight;
        this.color = Color.valueOf(color.toUpperCase());
        this.engineType = engineType;
        this.isReadyToDrive = isReadyToDrive;
    }

    @Override
    public String toString() {
        return "Motorcycle: model=" + model + ", year=" + year + ", price=" + price + ", weight=" + weight +
                        ", color='" + color + ", engineType='" + engineType + ", isReadyToDrive=" + isReadyToDrive;
    }
}