package Lesson03Exercise;

import Lesson02.Constructors.Circle01;

public class Rectangletest {
public static void main(String[] args) {
    Rectangle r1 = new Rectangle(10, 40);
    r1.showInfo();
}


public static void createRectangle() {
    Rectangle r1 = new Rectangle(10, 10);
    printArea(r1);
    System.out.println("---------------------");
    printPerimeter(r1);
    System.out.println("---------------------");
    printWidth(r1);
    System.out.println("---------------------");
    System.out.println("---------------------");
    System.out.println("Og så hele koden fra printInfo koden");
    System.out.println("---------------------");
    printInfo(r1);
}

    public static void printPerimeter(Rectangle rect) {
        // Udskriv arealer
        System.out.println("Perimeter of rectangle: " + rect.getPerimeter());
    }
    public static void printArea(Rectangle rect) {
        // Udskriv arealer
        System.out.println("Area of rectangle: " + rect.getArea());
    }
    public static void printWidth(Rectangle rect) {
        // Udskriv arealer
        System.out.println("Area of rectangle: " + rect.getWidth());
    }
    /** Printer rektanglets information */
    public static void printInfo(Rectangle rect) {
    rect.showInfo();;
    }

}
