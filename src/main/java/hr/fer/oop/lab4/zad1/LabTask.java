package hr.fer.oop.lab4.zad1;

import java.util.*;

public class LabTask {
    public static Collection<String> getMostPopularPeople(Collection<Pair> pairs) {
        if (pairs == null) return null;
        List<Pair> pairList = new LinkedList<>(pairs);
        List<Pair> copy = new LinkedList<>(pairs);
        for (int i = 0; i < copy.size(); i++) {
            for (int j = i + 1; j < copy.size(); j++) {
                Pair first = copy.get(i);
                Pair second = copy.get(j);
                if (first.compareTo(second) == 0) {
                    pairList.remove(second);
                }
                if (first.getName1().compareTo(second.getName2()) == 0 && first.getName2().compareTo(second.getName1()) == 0) {
                    pairList.remove(second);
                }
            }
        }
        List<String> names = new LinkedList<>();
        for (Pair pair : pairList) {
            names.add(pair.getName1());
            names.add(pair.getName2());
        }
        int max = 0;
        for (String name : names) {
            int temp = Collections.frequency(names, name);
            if (temp >= max) {
                max = temp;
            }
        }
        Set<String> popular = new TreeSet<>();
        for (String name : names) {
            if (max == Collections.frequency(names, name)) {
                popular.add(name);
            }
        }
        return popular;
    }
}
