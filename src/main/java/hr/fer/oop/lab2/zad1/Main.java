package hr.fer.oop.lab2.zad1;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(1, 4);
        Point p2 = new Point(3, 4);

        System.out.println(Point.distanceTo(p1, p2)); // 2.0

        Circle c = new Circle(new Point(1, 2), 1);
        Rectangle r = new Rectangle(new Point(3, 4), 3, 4);

        System.out.println(c.area()); // 3.141592653589793
        System.out.println(r.area()); // 12.0

        System.out.println(c.difference(r)); // 8.858407346410207

        System.out.println(r.contains(c.getCenter())); // false
        System.out.println(r.contains(r.getCenter())); // true

        System.out.println(c.boundingBox().getWidth()); // 2
        System.out.println(r.boundingBox().getHeight()); // 4
    }
}
