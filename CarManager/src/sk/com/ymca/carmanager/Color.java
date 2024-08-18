package sk.com.ymca.carmanager;

public enum Color {
    BLACK("Black"), ORANGE("Orange"), WHITE("White"), YELLOW("Yellow"), BLUE("Blue"), GREEN("Green");

    String color;

    Color(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color;
    }
}
