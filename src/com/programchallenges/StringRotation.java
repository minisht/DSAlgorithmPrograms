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
        String line;
        String totalString = "";

        while ((line = stdin.readLine()) != null && line.length() != 0){
            totalString = totalString + " " + line;
//            String[] input = line.split(" ");
        }
        String[] input = totalString.split(" ");
        String str1 = input[0];
        String str2 = input[1];
        System.out.println(str1 + ", " + str2);

//        String str1 = "AACD";
//        String str2 = "ACDA";

        if (areRotations(str1, str2)){
            System.out.println("Strings are rotations of each other");
        } else {
            System.out.println("Strings are not rotations of each other");
        }
    }

    static boolean areRotations(String str1, String str2){
        return (str1.length() == str2.length() &&
                (str1 + str1).indexOf(str2) != -1);
    }
}
