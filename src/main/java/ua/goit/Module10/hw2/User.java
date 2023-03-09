package ua.goit.Module10.hw2;

import java.io.File;

public class User {
    private String name;
    private int age;
    private Test test;

    public User(String name, int age, Test test) {
        this.name = name;
        this.age = age;
        this.test = test;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
