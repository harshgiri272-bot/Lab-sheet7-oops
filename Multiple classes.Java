package shapes;
public class Circle {
    private double radius;
    public Circle(double radius) { this.radius = radius; }
    public double area() { return Math.PI * radius * radius; }
}
package shapes;
public class Rectangle {
    private double length, width;
    public Rectangle(double length, double width) { this.length = length; this.width = width; }
    public double area() { return length * width; }
}
