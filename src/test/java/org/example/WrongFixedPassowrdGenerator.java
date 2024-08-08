package org.example;

public class WrongFixedPassowrdGenerator implements PasswordGenerator{

    @Override
    public String generatePassword() {
        return "ab"; // 2글자

    }
}
