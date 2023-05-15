package hr.fer.oop.lab4.zad2;

import java.util.HashMap;
import java.util.Map;

public class CSVLine {
    private Map<String, String> elements;

    public CSVLine() {
        this.elements = new HashMap();
    }

    public CSVLine(Map<String, String> elements) {
        this.elements.putAll(elements);
    }

    public void addElement(String header, String value) {
        elements.put(header, value);
    }

    public String getElement(String header) {
        return elements.get(header);
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public int numElements() {
        return elements.size();
    }
}

