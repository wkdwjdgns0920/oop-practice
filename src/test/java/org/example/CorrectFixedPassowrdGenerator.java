package org.example;

public class CorrectFixedPassowrdGenerator implements PasswordGenerator{

    @Override
    public String generatePassword() {
        return "abcdefgh"; // 8글자
    }
}
