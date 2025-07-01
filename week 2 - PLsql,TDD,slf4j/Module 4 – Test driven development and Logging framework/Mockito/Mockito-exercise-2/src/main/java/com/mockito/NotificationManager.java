package com.mockito;

public class NotificationManager {
    private MessageService messageService;

    public NotificationManager(MessageService messageService) {
        this.messageService = messageService;
    }

    public void notifyUser(String user) {
        if (user != null && !user.isEmpty()) {
            messageService.sendMessage(user, "Welcome!");
        }
    }
}
