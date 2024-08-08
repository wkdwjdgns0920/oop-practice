package org.example;

public class User {
    private String passoword;

    public void initPassword(PasswordGenerator passwordGenerator) {
        // as-is
            // RandomPasswordGenerator randomPasswordGenerator = new RandomPasswordGenerator();
        // to-be
        // 더 낮은 결합도를 가질 수 있다.
        String password = passwordGenerator.generatePassword();
        /**
         * 비밀번호는 최소 8자 이상 12자 이하여야 한다.
         */
        if (password.length() >= 8 && password.length() <= 12) {
            this.passoword = password;
        }
    }


    public String getPassoword() {
        return passoword;
    }
}
