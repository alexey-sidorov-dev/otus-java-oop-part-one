package ru.otus.java.basic;

import com.google.common.base.Joiner;

public class User {
    private final String fullName;
    private final int birthYear;
    private final String email;

    public int getBirthYear() {
        return birthYear;
    }

    public User(String fullName, int birthYear, String email) {
        this.fullName = fullName;
        this.birthYear = birthYear;
        this.email = email;
    }

    public String getUserInfo() {
        Joiner joiner = Joiner.on(";").skipNulls();

        return joiner.join("ФИО:" + fullName, "Год рождения:" + birthYear,"E-mail:" + email);
    }
}