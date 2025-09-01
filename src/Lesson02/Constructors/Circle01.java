package Lesson02.Constructors;

public class Circle01 {
    private double radius;

    // Konstruktør
    public Circle01(double radius) {
        this.radius = radius;
    }

    // Beregn areal
    public double beregnAreal() {
        return Math.PI * radius * radius;
    }

    public double setRadius(double radius) {
        return this.radius = radius;
    }
}
