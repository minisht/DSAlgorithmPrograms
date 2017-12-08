package com.programchallenges;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by minishtera on 12/7/17.
 */
public class Anagram {

    public static void main(String[] args){
        String a = "minish";
        String b = "nimish";
        if (isAnagram(a, b)){
            System.out.println("Both strings form Anagram");
        }

    }

    public static boolean isAnagram(String a, String b){

        // test for invalid input
        if (a == null || b == null || a.equals("") || b.equals("") ){
            throw new IllegalArgumentException();
        }

        // initial quick test for non-anagrams
        if (a.length() != b.length()){
            return false;
        }

        a = a.toLowerCase();
        b = b.toLowerCase();

        // Populate a map with letters and frequencies of String b
        Map<Character, Integer> map = new HashMap<>();

        for (int k = 0; k < b.length(); k++){
            char letter = b.charAt(k);

            int frequency = 0;

            if (map.containsKey(letter)){
                frequency = map.get(letter);
            }
            map.put(letter, ++frequency);

            letter = a.charAt(k);

            frequency = 0;

            if (map.containsKey(letter)){
                frequency = map.get(letter);
            }

            map.put(letter, --frequency);

        }

        // Checking each character and it's count
        for (int value : map.values()){
            if (value != 0){
                return false;
            }
        }
        
        return true;
    }
}
