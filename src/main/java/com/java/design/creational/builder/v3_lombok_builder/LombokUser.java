package com.java.design.creational.builder.v3_lombok_builder;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class LombokUser {
    private String name;
    private int age;
    private String email;
    private String phoneNumber;
}
