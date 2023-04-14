package hr.fer.oop.lab2.zad1;

public interface Shape {
    Point getCenter();

    boolean contains(Point p);

    Rectangle boundingBox();

    double area();

    default double difference(Shape s) {
        return Math.abs(s.area() - this.area());
    }
}
