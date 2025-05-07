package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Rectangle;
import edu.cmu.cs.cs214.lab02.shapes.Circle;
import edu.cmu.cs.cs214.lab02.shapes.Square;
import edu.cmu.cs.cs214.lab02.shapes.Shape;

/**
 * Програмын эхлэлийн цэгийг агуулсан класс.
 */
public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(2, 3);
        Shape circle = new Circle(5);
        Shape square = new Square(4);

        new Renderer(rectangle).draw();
        new Renderer(circle).draw();
        new Renderer(square).draw();
    }
}