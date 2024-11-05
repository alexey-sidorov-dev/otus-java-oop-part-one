package ru.otus.java.basic;

import java.time.Year;

public class Main {
    public static void main(String[] args) {

        User[] users = generateUsers();
        int currentYear = Year.now().getValue();

        for (User user : users) {
            if (currentYear - user.getBirthYear() > 40) {
                System.out.println(user.getUserInfo());
            }
        }
    }

    static User[] generateUsers() {
        final String[] names = {"Donna Sekh", "Mohammad Biswas", "Brenda Begum", "Galina Chu", "Kristina Gong",
                "Ismail Ansari", "Galina Sultan", "Rene Vazquez", "Juana Islam", "Bin Meng"};
        final int[] years = {1999, 1981, 1970, 1927, 1972, 1964, 2021, 1960, 2005, 1971};
        final String[] emails = {"DonnaSekh@email.com", "MohammadBiswas@email.com", "BrendaBegum@email.com",
                "GalinaChu@email.com", "KristinaGong@email.com", "IsmailAnsari@email.com", "GalinaSultan@email.com",
                "ReneVazquez@email.com", "JuanaIslam@email.com", "BinMeng@email.com"};

        User[] users = new User[10];
        for (int i = 0; i < users.length; i++) {
            users[i] = new User(names[i], years[i], emails[i]);
        }

        return users;
    }
}
