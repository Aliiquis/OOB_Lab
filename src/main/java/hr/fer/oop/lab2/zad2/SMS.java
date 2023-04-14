package hr.fer.oop.lab2.zad2;

public class SMS extends Message {
    private String recipientNumber;

    public SMS(String text) {
        super(text);
    }

    public String getRecipientNumber() {
        return recipientNumber;
    }

    public void setRecipientNumber(String recipientNumber) {
        this.recipientNumber = recipientNumber;
    }

    @Override
    public String toString() {
        return super.toString() + ' ' + recipientNumber;
    }
}
