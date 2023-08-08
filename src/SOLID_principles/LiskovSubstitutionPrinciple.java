package SOLID_principles;

public class LiskovSubstitutionPrinciple {
}


//  objects of a superclass should be replaceable with objects of its subclasses
//  without affecting the correctness of the program.

class Shape1 {
    public double area() {
        return 0;
    }
}

class Circle1 extends Shape1 {
    private double radius;

    public Circle1(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }
}

class Rectangle1 extends Shape1 {
    private double width;
    private double height;

    public Rectangle1(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }
}

class Client1 {
    public static void printArea(Shape1 shape) {
        System.out.println("Area: " + shape.area());
    }

    public static void main(String[] args) {
        Shape1 circle1 = new Circle1(5);
        Shape1 rectangle1 = new Rectangle1(4, 6);

        printArea(circle1);
        printArea(rectangle1);
    }

}

