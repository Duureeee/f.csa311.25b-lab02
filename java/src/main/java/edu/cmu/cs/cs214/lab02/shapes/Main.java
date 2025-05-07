// Main.java
package edu.cmu.cs.cs214.lab02.shapes;

import edu.cmu.cs.cs214.lab02.Renderer;
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