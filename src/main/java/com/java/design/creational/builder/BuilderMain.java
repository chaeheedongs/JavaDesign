package com.java.design.creational.builder;

import com.java.design.creational.builder.v1.User;
import com.java.design.creational.builder.v2.BuilderUser;
import com.java.design.creational.builder.v3.AnnotationBuilderUser;

public class BuilderMain {

    public static void main(String[] args) {
        User user = new User("name", 30, "test@test.com", "010-1111-2222");
        System.out.println("user = " + user);


        BuilderUser builderUser = new BuilderUser()
                .name("name")
                .age(30)
                .email("test@test.com")
                .phoneNumber("010-1111-1111")
                .build();

        System.out.println("builderUser = " + builderUser);


        AnnotationBuilderUser annotationBuilderUser = AnnotationBuilderUser.builder()
                .name("name")
                .age(30)
                .email("test@test.com")
                .phoneNumber("010-1111-1111")
                .build();

        System.out.println("annotationBuilderUser = " + annotationBuilderUser);
    }
}
