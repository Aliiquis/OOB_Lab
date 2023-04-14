package hr.fer.oop.lab2.zad2;

public abstract class Message implements Encodable {
    private String text;

    public Message(String text) {
        this.text = text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }

    @Override
    public void encode() {
        StringBuilder sb = new StringBuilder(text);
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            if (Character.isAlphabetic(c)) {
                if (Character.isUpperCase(c)) {
                    sb.setCharAt(i, (char) (((c - 'A' + 1) % 26) + 'A'));
                } else {
                    sb.setCharAt(i, (char) (((c - 'a' + 1) % 26) + 'a'));
                }
            }
        }
        text = sb.toString();
    }
}
