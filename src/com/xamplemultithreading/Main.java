package com.xamplemultithreading;

import static com.xamplemultithreading.ThreadColor.ANSI_GREEN;
import static com.xamplemultithreading.ThreadColor.ANSI_PURPLE;
import static com.xamplemultithreading.ThreadColor.ANSI_RED;

/**
 * Created by minishtera on 12/8/17.
 */
public class Main {
    public static void main(String[] args){
        System.out.println(ANSI_PURPLE + "Hello from the main Thread.");

        Thread anotherThread = new AnotherThread();
        anotherThread.setName("== Another Thread ==");
        anotherThread.start();

        new Thread() {
            public void run() {
                System.out.println(ANSI_GREEN + "Hello from anonymous Thread.");
            }
        }.start();

        Thread myRunnableThread = new Thread(new MyRunnable()){
            @Override
            public void run() {
                System.out.println(ANSI_RED + "Hello from the anonymous class's implementation of run()");
                try {
                    anotherThread.join();
                    System.out.println(ANSI_RED + "AnotherThread terminated, or timed out, so I'm running again");
                } catch (InterruptedException e) {
                    System.out.println(ANSI_RED + "I couldn't wait after all. I was interrupted");
                }
            }
        };

        myRunnableThread.start();

        System.out.println(ANSI_PURPLE + "Hello again from the main Thread.");

    }
}
