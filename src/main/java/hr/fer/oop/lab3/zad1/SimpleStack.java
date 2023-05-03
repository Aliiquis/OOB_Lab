package hr.fer.oop.lab3.zad1;

public class SimpleStack<T> {
    private T[] stack;

    public SimpleStack(int maxSize) {
        if (maxSize < 1) throw new IllegalArgumentException();
        this.stack = (T[]) new Object[maxSize];
    }

    public void push(T element) {
        if (isFull()) throw new RuntimeException();
        for (int i = stack.length - 1; i > 0; i--) {
            stack[i] = stack[i - 1];
        }
        stack[0] = element;
    }

    public T pop() {
        if (isEmpty()) throw new NullPointerException();
        T toReturn = stack[0];
        for (int i = 0; i < stack.length - 1; i++) {
            stack[i] = stack[i + 1];
        }
        stack[stack.length - 1] = null;
        return toReturn;
    }

    public boolean isFull() {
        for (T t : stack) {
            if (t == null) return false;
        }
        return true;
    }

    public boolean isEmpty() {
        for (T t : stack) {
            if (t != null) return false;
        }
        return true;
    }

    public int getMaxSize() {
        return stack.length;
    }

    public int getNumberOfElements() {
        int n = 0;
        for (T t : stack) {
            if (t != null) n++;
        }
        return n;
    }
}
