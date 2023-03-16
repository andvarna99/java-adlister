package com.codeup.adlister.util;

import org.mindrot.jbcrypt.BCrypt;

public class Password {

    private static final int ROUNDS = 12;

    //you give this function a plain text string; it gives back a hash: uses the salting technique
    public static String hash(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt(ROUNDS));
    }

    public static boolean check(String password, String hash) {
        return BCrypt.checkpw(password, hash);
    }
    public static void main(String[] args) {
        String pw = "password";
        System.out.println(Password.hash(pw));

        String hash = "$2a$12$2gT3CoB8jFBfVIxeSKDRi.v9xopz/oGMytbgPZfA13P080q4hKp3K";
        System.out.println(Password.check(pw,hash));
    }

}
