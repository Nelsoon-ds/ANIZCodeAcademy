package Lesson03Exercise;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getPerimeter() {
        double length = this.length + this.width;
        double perimeter = 2 * length;
        return perimeter;
    }
    public String getArea() {
        double area = this.length * this.width;
        return "The area of the rectangle is: " + area;
    }
    public void showInfo() {
        System.out.println("The length of the rectangle is: " + this.length);
        System.out.println("The width of the rectangle is: " + this.width);
        System.out.println("The perimeter of the rectangle is: " + this.getPerimeter());
        System.out.println("The area of the rectangle is: " + this.getArea());
    }
}
