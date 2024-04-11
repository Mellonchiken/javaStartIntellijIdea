package sk.com.ymca.javaStart.lecture4.additional.task2;

// Name of the class should be more concrete
public class Methods {
    
    public double square(double r, double h) {
        return  2 * Math.PI * r * (r + h);
    }

    public double volume(double r, double h) {
        return Math.PI * Math.pow(r, 2) * h;
    }
}
