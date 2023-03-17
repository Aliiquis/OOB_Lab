package hr.fer.oop.lab1;

public class Main {
    public static void main(String[] args) {
        increasing(new int[10]);
        System.out.println(frequency(new int[]{4, 67, -2, 0, -15, 0, 4, 0}, 1));
        System.out.println("\"" + bezBrojeva(new String("Danas je va4ni jako hlad112323n6o.")) + "\"");
    }

    static void increasing(int[] arr) {
        arr[0] = (int) (Math.random() * 8) + 1;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * arr[i - 1]) + arr[i - 1];
        }
    }

    public static int frequency(int[] arr, int n) {
        int count = 0;
        for (int i : arr) {
            if (i == n) {
                count++;
            }
        }
        return count;
    }

    public static String bezBrojeva(String str) {
        StringBuilder sb = new StringBuilder();
        String[] rijeci = str.split(" ");
        for (String s : rijeci) {
            for (int i = 0; i < s.length(); i++) {
                if (Character.isDigit(s.charAt(i))) {
                    sb.append(s + " ");
                    break;
                }
            }
        }
        for (int i = 0; i < sb.length(); i++) {
            if (Character.isDigit(sb.charAt(i))) {
                sb.deleteCharAt(i);
                i--;
            }
        }
        return sb.length() == 0 ? "" : sb.deleteCharAt(sb.length() - 1).toString();
    }
}
