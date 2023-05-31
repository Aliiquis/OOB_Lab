package hr.fer.oop.lab5.zad1;

import java.util.function.Predicate;

public class Analysis {
    public static Predicate<Earthquake> newerThan(int year) {
        return eq -> Integer.parseInt(eq.getDate().substring(0, 4)) > year;
    }

    public static Predicate<Earthquake> byCityName(String cityName) {
        return eq -> eq.getCityName().equals(cityName);
    }

    public static Predicate<Earthquake> byMagnitudeAndDepth(int depth, double magnitude) {
        return eq -> eq.getDepth() > depth && eq.getMagnitude() > magnitude;
    }
}
