package edu.cmu.cs.cs214.lab02.shapes;

/**
 * Квадратыг дүрсэлсэн класс.
 */
public class Square implements Shape {
    private final double sideLen;

    public Square(double sideLen) {
        this.sideLen = sideLen;
    }

    @Override
    public double getArea() {
        return sideLen * sideLen;
    }
}