// Square.java
package edu.cmu.cs.cs214.lab02.shapes;

/**
 * Square класс нь Shape интерфейсийг хэрэгжүүлж, квадратын талбарыг тооцоолно.
 * Битүүмжлэлийг сайжруулахын тулд sideLen-г private final болгосон.
 */
public class Square implements Shape {
    private final double sideLen; // Талбарыг нууцлалтай болгосон

    public Square(double sideLen) {
        this.sideLen = sideLen;
    }

    @Override
    public double getArea() {
        return sideLen * sideLen;
    }
}