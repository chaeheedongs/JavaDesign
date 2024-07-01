package com.java.design.creational.builder.v2;

public class BuilderUser {
    private String name;
    private int age;
    private String email;
    private String phoneNumber;

    public BuilderUser() { }

    public BuilderUser name(String name) {
        this.name = name;
        return this;
    }

    public BuilderUser age(int age) {
        this.age = age;
        return this;
    }

    public BuilderUser email(String email) {
        this.email = email;
        return this;
    }

    public BuilderUser phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public BuilderUser build() {
        BuilderUser builderUser = new BuilderUser();
        builderUser.name = name;
        builderUser.age = age;
        builderUser.email = email;
        builderUser.phoneNumber = phoneNumber;

        return builderUser;
    }

    @Override
    public String toString() {
        return "BuilderUser{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
