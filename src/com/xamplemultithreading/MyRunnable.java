package com.xamplemultithreading;

import static com.xamplemultithreading.ThreadColor.ANSI_RED;

/**
 * Created by minishtera on 12/10/17.
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(ANSI_RED + "Hello from MyRunnable's implementation of Run()");
    }
}
