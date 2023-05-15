package hr.fer.oop.lab4.zad2;

public class Main {
    public static void main(String[] args) {
        CSVData data = CSVLoader.loadCSVFile("src/main/java/hr/fer/oop/lab4/zad2/data.csv");
        System.out.println(data.getHeaders());
        /*for (int i = 0; i < data.numLines(); i++) {
            CSVLine line = data.getLine(i);
            for (int j = 0; j < line.numElements(); j++) {
                System.out.println(line.getElement(data.getHeaders().get(j)));
            }
        }*/
    }
}
