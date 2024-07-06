package com.java.design.creational.builder.v1_constructure_vo;

public class User {

    private String name;
    private int age;
    private String email;
    private String phoneNumber;

    public User() {}

    public User(String name, int age, String email, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public User(String name) {
        this(name, 0, null, null);
    }

    public User(String name, int age) {
        this(name, age, null, null);
    }

    public User(String name, int age, String email) {
        this(name, age, email, null);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
