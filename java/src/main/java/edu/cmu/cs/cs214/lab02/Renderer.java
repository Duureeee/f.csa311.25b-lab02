// Renderer.java
package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Shape;

/**
 * Renderer класс нь дүрсийг дүрслэх үүрэгтэй.
 * Shape интерфейсээс хамааралтай бөгөөд аливаа дүрсийг хүлээн авах боломжтой.
 */
public class Renderer {
    private final Shape shape;

    public Renderer(Shape shape) {
        this.shape = shape;
    }

    public void draw() {
        double area = shape.getArea();
        System.out.println("Shape printed\nIts area is " + area);
    }
}