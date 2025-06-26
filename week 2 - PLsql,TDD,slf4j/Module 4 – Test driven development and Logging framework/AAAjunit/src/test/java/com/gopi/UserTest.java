package com.gobi;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class UserTest {

    private User user;

    @Before
    public void setUp() {
        user = new User("Gobi");
        System.out.println(" Setup done");
    }

    @Test
    public void testGreeting() {
        String greeting = user.getGreeting();
        assertEquals("Hello, Gobi", greeting);
    }

    @After
    public void tearDown() {
        user.logout();
        user = null;
        System.out.println(" Teardown done");
    }
}
