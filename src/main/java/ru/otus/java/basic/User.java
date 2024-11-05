package ru.otus.java.basic;

import com.google.common.base.Joiner;

public class User {
    private final String fullName;
    private final int birthYear;
    private final String email;

    public String getFullName() {
        return fullName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getEmail() {
        return email;
    }

    public User(String fullName, int birthYear, String email) {
        this.fullName = fullName;
        this.birthYear = Math.abs(birthYear);
        this.email = email;
    }
}