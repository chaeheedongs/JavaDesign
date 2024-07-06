package com.java.design.creational.builder;

import com.java.design.creational.builder.v1_constructure_vo.User;
import com.java.design.creational.builder.v2_java_builder.BuilderUser;
import com.java.design.creational.builder.v3_lombok_builder.LombokUser;
import com.java.design.creational.builder.v4_construct_lombok_builder.ConstructBuilderUser;

public class BuilderMain {

    public static void main(String[] args) {

        /* construct set */
        User user = new User("name", 30, "test@test.com", "010-1111-1111");
        System.out.println("user = " + user);

        /* java builder set */
        BuilderUser builderUser = BuilderUser.builder()
                .name("name")
                .age(30)
                .email("test@test.com")
                .phoneNumber("010-1111-1111")
                .build();

        System.out.println("builderUser = " + builderUser);

        /* class lombok set */
        LombokUser lombokUser = LombokUser.builder()
                .name("name")
                .age(30)
                .email("test@test.com")
                .phoneNumber("010-1111-1111")
                .build();

        System.out.println("lombokUser = " + lombokUser);

        /* construct lombok set */
        ConstructBuilderUser constructBuilderUser = ConstructBuilderUser.builder()
                .age(30)
                .email("test@test.com")
                .phoneNumber("010-1111-1111")
                .build();

        System.out.println("constructBuilderUser = " + constructBuilderUser);
    }
}
