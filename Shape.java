class Shape {
    void displayShape() {
    }
}
class Circle extends Shape {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    double area() {
        return 3.14 * radius * radius;
    }
}
class Rectangle extends Shape {
    double length, width;
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    double area() {
        return length * width;
    }
}
public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        c.displayShape();
        System.out.println("Circle Area: " + c.area());
        Rectangle r = new Rectangle(4, 6);
        r.displayShape();
        System.out.println("Rectangle Area: " + r.area());
    }
}

