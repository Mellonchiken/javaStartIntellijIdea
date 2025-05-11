package sk.com.ymca.carmanager;

import java.util.regex.Pattern;
public class Car {
    String model;
    int year;
    int price;
    int weight;
    Color color;

    public Car(String model, int year, int price, int weight, String color) {
        this.model = model;
        this.year = year;
        this.price = price;
        this.weight = weight;
        this.color = Color.valueOf(color.toUpperCase().replaceAll(String.valueOf(Pattern.CASE_INSENSITIVE), ""));
    }

    @Override
    public String toString() {
        return "Car: model=" + model + ", year=" + year +
                ", price=" + price + ", weight=" + weight + ", color=" + color;
    }
}
