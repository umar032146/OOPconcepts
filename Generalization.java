/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package generalization;
class Shape {
    String name;

    public Shape(String name) {
        this.name = name;
    }

    double calculateArea() {
        return 0.0;
    }
}

// Derived class representing a specific type of shape (Circle)
class Circle extends Shape {
    double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Derived class representing another specific type of shape (Rectangle)
class Rectangle extends Shape {
    double length;
    double width;

    public Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }
}

public class Generalization {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Shape genericShape = new Shape("Generic Shape");
        Circle circle = new Circle("Circle", 5.0);
        Rectangle rectangle = new Rectangle("Rectangle", 4.0, 6.0);

        // Polymorphic behavior - calculating areas of different shapes
        System.out.println(genericShape.name + " Area: " + genericShape.calculateArea());
        System.out.println(circle.name + " Area: " + circle.calculateArea());
        System.out.println(rectangle.name + " Area: " + rectangle.calculateArea());
    }
}
