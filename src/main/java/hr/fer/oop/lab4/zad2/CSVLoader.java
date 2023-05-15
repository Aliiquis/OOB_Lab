package hr.fer.oop.lab4.zad2;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class CSVLoader {
    public static CSVData loadCSVFile(String path) {
        File csvfile = new File(path);
        CSVData data = new CSVData();
        if (!csvfile.exists()) return data;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new BufferedInputStream(new FileInputStream(csvfile)), StandardCharsets.UTF_8))) {
            String[] headerLine = br.readLine().split(", ");
            List<String> headers = List.of(headerLine);
            data.addHeaders(headers);
        } catch (IOException ignored) {
        }
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new BufferedInputStream(new FileInputStream(csvfile)), StandardCharsets.UTF_8))) {
            br.readLine();
            while (true) {
                String line = br.readLine();
                if (line == null) break;
                String[] elements = line.split(", ");
                if (elements.length > data.getHeaders().size()) throw new IndexOutOfBoundsException();
                CSVLine csvLine = new CSVLine();
                for (int i = 0; i < data.getHeaders().size(); i++) {
                    if (i < elements.length && elements[i] != null)
                        csvLine.addElement(data.getHeaders().get(i), elements[i]);
                }
                data.addLine(csvLine);
            }
        } catch (IOException ignored) {
        }
        return data;
    }
}
