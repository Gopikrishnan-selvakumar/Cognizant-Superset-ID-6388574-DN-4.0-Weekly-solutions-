package com.mockito;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class NotificationManagerTest {

    @Test
    public void testSendMessageCalledOnce() {
        MessageService mockService = mock(MessageService.class);


        NotificationManager manager = new NotificationManager(mockService);

        manager.notifyUser("Gobi");

        verify(mockService).sendMessage("Gobi", "Welcome!"); // should be called
        verify(mockService, times(1)).sendMessage("Gobi", "Welcome!");
        verify(mockService, never()).sendMessage("SomeoneElse", "Welcome!");
    }
}
