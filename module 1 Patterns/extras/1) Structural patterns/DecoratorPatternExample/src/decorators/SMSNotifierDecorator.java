package com.decorator.notification.decorators;

import com.decorator.notification.Notifier;

public class SMSNotifierDecorator extends NotifierDecorator {

    public SMSNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String msg) {
        super.send(msg);                  // keep existing behaviour
        System.out.println("📱  SMS sent: " + msg);
    }
}
