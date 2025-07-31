package com.decorator.notification.decorators;

import com.decorator.notification.Notifier;

public class SlackNotifierDecorator extends NotifierDecorator {

    public SlackNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String msg) {
        super.send(msg);                  // keep existing behaviour
        System.out.println("💬  Slack sent: " + msg);
    }
}
