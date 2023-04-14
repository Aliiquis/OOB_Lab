package hr.fer.oop.lab2.zad2;

public class Email extends Message {
    private String sender;
    private String receiver;
    private String subject;

    public Email(String text) {
        super(text);
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return super.toString() + ' ' + sender + ' ' + receiver + ' ' + subject;
    }
}
