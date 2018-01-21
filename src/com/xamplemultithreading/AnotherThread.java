package com.xamplemultithreading;

import static com.xamplemultithreading.ThreadColor.ANSI_BLUE;

/**
 * Created by minishtera on 12/8/17.
 */
public class AnotherThread extends Thread {
    @Override
    public void run() {
        System.out.println(ANSI_BLUE + "Hello from " + currentThread().getName());

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(ANSI_BLUE + "Another thread woke me up");
        }

        System.out.println(ANSI_BLUE + "Three seconds have passed and I'm awake");

    }
}
