package SOLID_principles;

public class OpenClosedPrinciple {
}


// class should be open for extension but closed for modification.
interface Shape {
    double calculateArea();
}

class Circle implements Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}

class Rectangle implements Shape {
    private double width;
    private double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

class Client {
    public static void main(String[] args) {
        Shape shape = new Rectangle(10, 5);
        double area = shape.calculateArea();
        System.out.println(area);
    }
}

