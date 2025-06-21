package com.decorator.notification;

import com.decorator.notification.decorators.*;

public class Run {
    public static void main(String[] args) {

        // 1) Plain email only
        Notifier emailOnly = new EmailNotifier();
        emailOnly.send("Build succeeded ✅");

        System.out.println("-----");

        // 2) Email + SMS
        Notifier emailAndSms = new SMSNotifierDecorator(
                new EmailNotifier());
        emailAndSms.send("Server down ⚠️");

        System.out.println("-----");

        // 3) Email + SMS + Slack (stack decorators!)
        Notifier multiChannel = new SlackNotifierDecorator(
                new SMSNotifierDecorator(
                        new EmailNotifier()));
        multiChannel.send("Release deployed 🚀");
    }
}
