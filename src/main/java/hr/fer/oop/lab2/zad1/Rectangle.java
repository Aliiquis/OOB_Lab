package hr.fer.oop.lab2.zad1;

public class Rectangle implements Shape {
    private Point center;
    private int width;
    private int height;

    public Rectangle(Point center, int width, int height) {
        this.center = center;
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public Point getCenter() {
        return center;
    }

    @Override
    public boolean contains(Point p) {
        boolean checkX = p.getX() > center.getX() - width / 2 && p.getX() < center.getX() + width / 2;
        boolean checkY = p.getY() > center.getY() - height / 2 && p.getY() < center.getY() + height / 2;
        return checkX && checkY;
    }

    @Override
    public Rectangle boundingBox() {
        return this;
    }

    @Override
    public double area() {
        return width * height;
    }
}
