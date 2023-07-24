package structural_design_pattern;

import java.util.HashMap;

public class Facade {
}

interface Shape {
    void draw();
}

class Circle implements Shape {
    public void draw() {
        System.out.println("circle");
    }
}

class Square implements Shape {
    public void draw() {
        System.out.println("square");
    }
}

class Rectangle implements Shape {
    public void draw() {
        System.out.println("rectangle");
    }
}

class ShapeMaker {
    private Circle circle;
    private Square square;
    private Rectangle rectangle;

    ShapeMaker() {
        circle = new Circle();
        square = new Square();
        rectangle = new Rectangle();
    }

    void drawCircle() {
        circle.draw();
    }

    void drawSquare() {
        square.draw();
    }

    void drawRectangle() {
        rectangle.draw();
    }
}

class Main1 {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawSquare();
        shapeMaker.drawRectangle();
    }
}
