package hr.fer.oop.lab2.zad1;

public class Circle implements Shape {
    private Point center;
    private int radius;

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public Point getCenter() {
        return center;
    }

    @Override
    public boolean contains(Point p) {
        return Point.distanceTo(p, center) <= radius;
    }

    @Override
    public Rectangle boundingBox() {
        return new Rectangle(center, 2 * radius, 2 * radius);
    }

    @Override
    public double area() {
        return Math.pow(radius, 2) * Math.PI;
    }
}
