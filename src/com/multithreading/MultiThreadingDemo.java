package com.multithreading;

/**
 * Created by minishtera on 12/5/17.
 */
public class MultiThreadingDemo extends Thread {
    public void run() {
        System.out.println("My thread is in running state.");
    }

    public static void main(String[] args){
        MultiThreadingDemo obj = new MultiThreadingDemo();
        obj.start();
    }
}
