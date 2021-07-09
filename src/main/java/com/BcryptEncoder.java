package com;


import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BcryptEncoder {
    public static void main(String[] args) {
        BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
        for (int i = 0; i <=10; i++) {
            //encrypt password
            String encodedString=encoder.encode("admin");
            System.out.println(encodedString);
        }
    }
}
