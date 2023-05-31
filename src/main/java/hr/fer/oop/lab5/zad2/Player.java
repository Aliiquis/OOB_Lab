package hr.fer.oop.lab5.zad2;

import java.util.Comparator;

public class Player implements Comparable<Player> {
    String firstName, lastName;
    String playerID;
    int rating;

    public Player(String firstName, String lastName, String playerID, int rating) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.playerID = playerID;
        this.rating = rating;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPlayerID() {
        return playerID;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public int compareTo(Player o) {
        return playerID.compareTo(o.playerID);
    }

    public static Comparator<Player> COMPARE_BY_NAME = Comparator.comparing(Player::getLastName).thenComparing(Player::getFirstName);
}
