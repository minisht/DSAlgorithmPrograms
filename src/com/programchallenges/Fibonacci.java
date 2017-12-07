package com.programchallenges;

import java.util.Scanner;

/**
 * Created by minishtera on 11/16/17.
 */
public class Fibonacci {
    public static void main(String[] args)
    {
        int number = new Scanner(System.in).nextInt();
        for(int i=1; i<=number; i++){
            System.out.println(fibonacci(i) + " ");
        }
    }

    // Java Program for Fibonacci number using recursion.
    public static int fibonacci(int number){
        if(number == 1 || number == 2){
            return 1;
        }
        return fibonacci(number - 1) + fibonacci(number - 2);
    }

    // Java program to calculate Fibonacci number using loop or iteration
    public static int fibonacci2(int number){
        if(number ==1 || number ==2){
            return 1;
        }
        int fibo1 = 1, fibo2 = 1, fibonacci = 1;
        for (int i = 3; i <= number; i++){
            fibonacci = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibonacci;
        }
        return fibonacci;
    }
}
