// Main.java
package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Shape;
import edu.cmu.cs.cs214.lab02.shapes.Rectangle;
import edu.cmu.cs.cs214.lab02.shapes.Circle;
import edu.cmu.cs.cs214.lab02.shapes.Square;

/**
 * Main класс нь програмын эхлэлийг агуулна.
 * Shape интерфейс ашиглан өөр өөр дүрсүүдийг Renderer-д дамжуулж ажиллуулна.
 */
public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(2, 3);
        Shape circle = new Circle(5);
        Shape square = new Square(4);

        new Renderer(rectangle).draw(); // Тэгш өнцөгтийг дүрслэх
        new Renderer(circle).draw();    // Дугуйг дүрслэх
        new Renderer(square).draw();    // Квадратыг дүрслэх
    }
}