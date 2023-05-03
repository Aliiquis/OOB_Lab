package hr.fer.oop.lab3.zad2;

public class ObradaPodataka {
    public static int obradi() {
        int sum = 0;
        for (int i = 0; i < DataSource.size(); i++) {
            try {
                int num = DataSource.getNextNumber();
                int processed;
                try {
                    processed = DataProcessUtil.processNumber(num);
                } catch (Exception e) {
                    processed = DataProcessUtil.handleException(e, num);
                }
                sum += processed;
            } catch (Exception ignored) {
            }
        }
        return sum;
    }
}
