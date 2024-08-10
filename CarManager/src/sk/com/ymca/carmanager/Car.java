package sk.com.ymca.carmanager;

import java.util.Objects;

public class Car {
    private String mark;
    private String model;
    private int price;
    private int weight;
    private String color;
    private String engine;
    protected int distance = 0;

    public Car(String mark, String model, int price, int weight, String color, String engine){
     this.mark = mark;
     this.model = model;
     this.price = price;
     this.weight = weight;
     this.color = color;
     this.engine = engine;
    }

    public void addDistance(int distance) {
        if (distance > 0) this.distance = distance;
    }

    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public String getEngine() {
        return engine;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        return getPrice() == car.getPrice() && getWeight() == car.getWeight() && Objects.equals(getMark(), car.getMark()) && Objects.equals(getModel(), car.getModel()) && Objects.equals(getColor(), car.getColor()) && Objects.equals(getEngine(), car.getEngine());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMark(), getModel(), getPrice(), getWeight(), getColor(), getEngine());
    }

    @Override
    public String toString() {
        return "mark= " + mark + ", model= " + model + ", price= " +
                price + ", weight= " + weight + ", color= " + color + ", engine= " + engine;
    }
}
