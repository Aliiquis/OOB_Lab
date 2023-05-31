package hr.fer.oop.lab5.zad1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Earthquake> earthquakes = new ArrayList<>();
        Earthquake e1 = new Earthquake("Zagreb", "2020-05-07", 5, 2.4);
        Earthquake e2 = new Earthquake("Dubrovnik", "2016-04-15", 8, 5.6);
        Earthquake e3 = new Earthquake("Zagreb", "2002-02-09", 11, 3.5);
        earthquakes.add(e1);
        earthquakes.add(e2);
        earthquakes.add(e3);

        Stream<Earthquake> analysis1 = earthquakes.stream().filter(Analysis.newerThan(2003));
        Stream<Earthquake> analysis2 = earthquakes.stream().filter(Analysis.byCityName("Zagreb"));
        Stream<Earthquake> analysis3 = earthquakes.stream().filter(Analysis.byMagnitudeAndDepth(2, 4.1));

        System.out.println(analysis1.collect(Collectors.toList()));
        System.out.println(analysis2.collect(Collectors.toList()));
        System.out.println(analysis3.collect(Collectors.toList()));
    }
}
