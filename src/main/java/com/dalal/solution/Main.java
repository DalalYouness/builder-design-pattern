package com.dalal.solution;


public class Main {
    public static void main(String[] args) {

            User user = new User.UserBuilder()
                    .id(1)
                    .name("youness")
                    .password("dalal1998")
                    .email("youness@gmail.com")
                    .fax("dalal fax")
                    .role("admin")
                    .address("sidi maarouf")
                    .phone("123456789")
                    .build();
        System.out.println(user);
    }
}