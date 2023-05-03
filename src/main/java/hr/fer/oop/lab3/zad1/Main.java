package hr.fer.oop.lab3.zad1;

public class Main {
    public static void main(String[] args) {
        SimpleStack<Integer> s = new SimpleStack<Integer>(4);
        int j = 0;
        while (!s.isFull()) s.push(j++);
        while (!s.isEmpty()) System.out.print(s.pop());
    }
}
