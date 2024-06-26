package sk.com.ymca.javaStart.lecture4.additional.task2;

public class AreaAndVolumeOfCylinder {          // Name of the class should be more concrete
    public double square(double r, double h) {
        return  2 * Math.PI * r * (r + h);
    }

    public double volume(double r, double h) {
        return Math.PI * Math.pow(r, 2) * h;
    }
}
