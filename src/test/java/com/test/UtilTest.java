package com.test;

import com.util.Util;
import junit.framework.TestCase;

public class UtilTest extends TestCase {
    public void testUtil() {
        assertEquals("The output", Util.getOutput());
    }
}
