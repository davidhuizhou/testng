package com.dzhou.testng;

/**
 * Created by huizhou on 11/17/15.
 */
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class TestNGSimpleTest {

    @Test
    public void testAdd(){
        System.out.println("TestNGSimpleTest.testAdd");
        String str = "TestNG is great";
        assertEquals("TestNG is great", str);
    }
}
