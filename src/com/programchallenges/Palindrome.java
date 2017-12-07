package com.programchallenges;

import java.util.Scanner;

/**
 * Created by minishtera on 11/16/17.
 */
public class Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();

        if(isPalindrome(x))
        {
            System.out.println(x + " is a Palindrome");
        }

    }

    public static boolean isPalindrome(String s) {
        if(s.length() == 0 || s.length() < 2)
        {
            return true;
        }
        if(s.charAt(0) == s.charAt(s.length()-1))
        {
            return isPalindrome(s.substring(1, s.length()-1));
        }
        return false;
    }
}
