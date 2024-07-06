package com.java.design.creational.builder.v4_construct_lombok_builder;

import lombok.Builder;
import lombok.ToString;

@ToString
public class ConstructBuilderUser {

    @Builder.Default
    private String name = "defaultName";
    private int age;
    private String email;
    private String phoneNumber;

    @Builder
    public ConstructBuilderUser(int age, String email, String phoneNumber) {
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
}
