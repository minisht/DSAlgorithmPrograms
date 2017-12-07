package com.programchallenges;

/**
 * Created by minishtera on 11/15/17.
 */
public class ReverseString {

    //    public static void main(String[] args) {
    public static void main(String[] args) {
        System.out.println(reverse("Minish"));
    }

    public static String reverse(String str) {
        StringBuilder strBuilder = new StringBuilder();
        char[] strChars = str.toCharArray();

        for (int i = strChars.length - 1; i >= 0; i--) {
            strBuilder.append(strChars[i]);
        }

        return strBuilder.toString();
    }

}
