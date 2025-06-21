package com.decorator.notification.decorators;

import com.decorator.notification.Notifier;

/** Holds a reference to another Notifier and delegates */
public abstract class NotifierDecorator implements Notifier {
    protected final Notifier wrappee;

    protected NotifierDecorator(Notifier notifier) {
        this.wrappee = notifier;
    }

    @Override
    public void send(String msg) {
        wrappee.send(msg);                // delegate to previous layer
    }
}
