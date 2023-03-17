package hr.fer.oop.lab1;

public class Main {
    public static void main(String[] args) {
        increasing(new int[10]);
        System.out.println(frequency(new int[]{4, 67, -2, 0, -15, 0, 4, 0}, 1));
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
}
