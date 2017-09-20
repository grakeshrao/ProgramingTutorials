package com.PhoneBook;

/**
 * Created by rakeshg on 8/19/17.
 */
public class PhoneBookEntry {
    private int number;
    private Name name;

    public PhoneBookEntry(String firstName, String lastName, int number) {
        this.name = new Name(firstName, lastName);
        this.number = number;
    }

    public Name getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "PhoneBookEntry{" +
                "number=" + number +
                ", name=" + name +
                '}';
    }
}
