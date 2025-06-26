package com.gobi;

import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionsTest {

    @Test
    public void testAssertions() {
        assertEquals(10, 5 + 5);           // ✅ Are they equal?
        assertTrue(10 > 5);                // ✅ Is this true?
        assertFalse(10 < 5);               // ✅ Is this false?
        assertNotNull("Gobi");            // ✅ Is it NOT null?
        assertNull(null);                 // ✅ Is it null?
    }
}
