package week6;
import java.util.Scanner;

// Shape Interface
interface Shape {
    void draw();
    double getArea();
}

// Circle Class
class Circle implements Shape {

    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public void draw() {
        System.out.println("Drawing Circle...");
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

// Rectangle Class
class Rectangle implements Shape {

    double width, height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void draw() {
        System.out.println("Drawing Rectangle...");
    }

    public double getArea() {
        return width * height;
    }
}

// Triangle Class
class Triangle implements Shape {

    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public void draw() {
        System.out.println("Drawing Triangle...");
    }

    public double getArea() {
        return 0.5 * base * height;
    }
}

// Main Class
public class ShapeManagement{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Shape shape = null;

        System.out.println("Choose Shape:");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");

        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.print("Enter radius: ");
                double r = sc.nextDouble();
                shape = new Circle(r);
                break;

            case 2:
                System.out.print("Enter width: ");
                double w = sc.nextDouble();
                System.out.print("Enter height: ");
                double h = sc.nextDouble();
                shape = new Rectangle(w, h);
                break;

            case 3:
                System.out.print("Enter base: ");
                double b = sc.nextDouble();
                System.out.print("Enter height: ");
                double t = sc.nextDouble();
                shape = new Triangle(b, t);
                break;

            default:
                System.out.println("Invalid choice");
                System.exit(0);
        }

        // Output
        System.out.println("Area: " + shape.getArea());
        shape.draw();
    }
}