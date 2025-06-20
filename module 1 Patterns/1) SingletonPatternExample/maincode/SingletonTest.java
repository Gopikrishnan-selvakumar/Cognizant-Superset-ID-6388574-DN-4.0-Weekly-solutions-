package com.singleton.example;

public class SingletonTest {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        System.out.println("Same object? " + (logger1 == logger2));

        Runnable task = () -> Logger.getInstance().log("Logging from worker");

        Thread t1 = new Thread(task, "T-1");
        Thread t2 = new Thread(task, "T-2");
        t1.start();
        t2.start();
    }
}
