package hr.fer.oop.lab4.zad1;

import java.util.Collection;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Collection<Pair> coll = new LinkedList<>();
        coll.add(new Pair("Gordan", "Nikola"));
        coll.add(new Pair("Mihaela", "Nikola"));
        coll.add(new Pair("Gordan", "Mario"));
        LabTask.getMostPopularPeople(coll);
    }
}
