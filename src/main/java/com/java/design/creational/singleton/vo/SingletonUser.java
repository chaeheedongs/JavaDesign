package com.java.design.creational.singleton.vo;

public class SingletonUser {
    private String name;
    private int age;
    private String email;
    private String phoneNumber;

    private static SingletonUser user;

    /* 외부에서 생성할 수 없도록 생성자를 private로 선언 */
    private SingletonUser() { }

    public static SingletonUser getInstance() {
        if (user == null) {
            user = new SingletonUser();
        }
        return user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public static SingletonUser getUser() {
        return user;
    }

    public static void setUser(SingletonUser user) {
        SingletonUser.user = user;
    }

    @Override
    public String toString() {
        return "SingletonUser{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
