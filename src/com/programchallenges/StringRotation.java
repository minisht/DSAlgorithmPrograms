package com.programchallenges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by minishtera on 12/7/17.
 */
public class StringRotation {

    public static void main(String[] args) throws IOException {

        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

        String str1 = "";
        String str2 = "";

        while ((str1 = stdin.readLine()) != null && str1.length() != 0) {
            str2 = stdin.readLine();

            System.out.println(str1 + ", " + str2);

            if (areRotations(str1, str2)) {
                System.out.println("Strings are rotations of each other");
            } else {
                System.out.println("Strings are not rotations of each other");
            }
        }
    }

    static boolean areRotations(String str1, String str2){
        return (str1.length() == str2.length() &&
                (str1 + str1).indexOf(str2) != -1);
    }
}
