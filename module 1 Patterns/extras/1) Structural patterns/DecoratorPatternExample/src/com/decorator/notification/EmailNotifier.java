package com.decorator.notification;

/** Basic notifier (core functionality) */
public class EmailNotifier implements Notifier {
    @Override
    public void send(String msg) {
        System.out.println("📧  Email sent: " + msg);
    }
}
