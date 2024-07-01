package com.java.design.creational.builder.v3;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class AnnotationBuilderUser {
    private String name;
    private int age;
    private String email;
    private String phoneNumber;
}
