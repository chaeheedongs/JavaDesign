package com.java.design.creational.singleton;

import com.java.design.creational.singleton.vo.SingletonUser;
import com.java.design.creational.singleton.vo.User;

public class SingletonMain {

    public static void main(String[] args) {

        /* 일반 객체 선언 */
        User user = new User();
        user.setName("name");
        user.setAge(30);
        user.setEmail("test@test.com");
        user.setPhoneNumber("010-1111-1111");

        System.out.println("### >> user");
        System.out.println("-------------------------------------");
        System.out.println("user = " + user);
        int userObjectAddress = System.identityHashCode(user);
        System.out.println("userObjectAddress = " + userObjectAddress);
        System.out.println("-------------------------------------");
        System.out.println();

        /* 일반 객체 선언 */
        User user2 = new User();
        user2.setName("name");
        user2.setAge(30);
        user2.setEmail("test@test.com");
        user2.setPhoneNumber("010-1111-1111");

        System.out.println("### >> user2");
        System.out.println("-------------------------------------");
        System.out.println("user2 = " + user2);
        int user2ObjectAddress = System.identityHashCode(user2);
        System.out.println("user2ObjectAddress = " + System.identityHashCode(user2));
        System.out.println("-------------------------------------");
        System.out.println();

        /* 일반 객체 주소값 비교 */
        System.out.println("### >> Assertion.assertThat(userObjectAddress).isSame(user2ObjectAddress)");
        System.out.println("-------------------------------------");
        System.out.println(userObjectAddress == user2ObjectAddress);
        System.out.println("-------------------------------------");
        System.out.println();

        /* 싱글톤 객체 선언 */
        SingletonUser singletonUser = SingletonUser.getInstance();
        singletonUser.setName("singletonName");
        singletonUser.setAge(30);
        singletonUser.setEmail("singletonUser@test.com");
        singletonUser.setPhoneNumber("010-2222-2222");

        System.out.println("### >> singletonUser");
        System.out.println("-------------------------------------");
        System.out.println("singletonUser = " + singletonUser);
        int singletonUserObjectAddress = System.identityHashCode(singletonUser);
        System.out.println("singletonUserObjectAddress = " + singletonUserObjectAddress);
        System.out.println("-------------------------------------");
        System.out.println();

        /* 싱글톤 객체 선언 */
        SingletonUser singletonUser2 = SingletonUser.getInstance();
        singletonUser2.setName("singletonName");
        singletonUser2.setAge(30);
        singletonUser2.setEmail("singletonUser@test.com");
        singletonUser2.setPhoneNumber("010-2222-2222");

        System.out.println("### >> singletonUser2");
        System.out.println("-------------------------------------");
        System.out.println("singletonUser2 = " + singletonUser2);
        int singletonUser2ObjectAddress = System.identityHashCode(singletonUser);
        System.out.println("singletonUser2ObjectAddress = " + singletonUser2ObjectAddress);
        System.out.println("-------------------------------------");
        System.out.println();

        /* 싱글톤 객체 주소값 비교 */
        System.out.println("### >> Assertion.assertThat(singletonUserObjectAddress).isSame(singletonUser2ObjectAddress)");
        System.out.println("-------------------------------------");
        System.out.println(singletonUserObjectAddress == singletonUser2ObjectAddress);
        System.out.println("-------------------------------------");
        System.out.println();
    }
}
