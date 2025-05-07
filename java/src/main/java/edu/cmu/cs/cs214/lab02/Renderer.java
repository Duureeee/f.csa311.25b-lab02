package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Shape;

/**
 * Дүрсийг дүрслэх үүрэгтэй класс.
 */
public class Renderer {
    private final Shape shape;

    public Renderer(Shape shape) {
        this.shape = shape;
    }

    /**
     * Дүрсний талбарыг хэвлэнэ.
     */
    public void draw() {
        double area = shape.getArea();
        System.out.println("Shape printed\nIts area is " + area);
    }
}