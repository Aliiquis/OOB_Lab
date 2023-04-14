package hr.fer.oop.lab2.zad2;

public class Main {
    public static void main(String[] args) {
        Email email = new Email("Java je zakon.");
        email.setSender("netko@gmail.com");
        email.setReceiver("netko_drugi@gmail.com");
        email.setSubject("Proba");

        System.out.println(email);//Java je zakon. netko@gmail.com netko_drugi@gmail.com Proba
        email.encode();
        System.out.println(email);//Kbwb kf ablpo. netko@gmail.com netko_drugi@gmail.com Proba

        SMS sms = new SMS("C# je zakon");
        sms.setRecipientNumber("099999999");
        System.out.println(sms);//C# je zakon 099999999
        sms.encode();
        System.out.println(sms);//D# kf ablpo 099999999
    }
}
