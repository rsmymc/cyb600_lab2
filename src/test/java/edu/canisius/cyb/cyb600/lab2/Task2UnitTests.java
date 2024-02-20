package edu.canisius.cyb.cyb600.lab2;

import edu.canisius.cyb.cyb600.lab2.exceptions.NotADogException;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Contains the Unit Tests for Task2.java
 * STUDENTS SHOULD NOT BE CHANGING THIS FILE.
 */
public class Task2UnitTests {
    protected Task2 task2;

    @Before
    /*
    STUDENTS SHOULD NOT BE CHANGING THIS METHOD.
     */
    public void setUp() {
        this.task2 = new Task2();
    }

    @Test
    public void test_method1_best(){
        String test = "test";
        String check = task2.method1(test);

        assertNotNull(check);
        assertEquals("test should outcome as TSET", "TSET", check);

    }
    @Test
    public void test_method1_best2(){
        String test = "aPpLe ciDer";
        String check = task2.method1(test);

        assertNotNull(check);
        assertEquals("test should outcome as REDIC ELPPA", "REDIC ELPPA", check);

    }
    @Test
    public void test_method1_average(){
        String test = "";
        String check = task2.method1(test);

        assertNotNull(check);
        assertEquals("test should outcome as empty string", "", check);
    }
    @Test
    public void test_method1_worst(){
        String test = null;
        String check = task2.method1(test);

        assertNotNull(check);
        assertEquals("test should outcome as empty string", "", check);
    }
    @Test
    public void test_method2_best(){
        String test = "test";
        String check = task2.method2(test);

        assertNotNull(check);
        assertEquals("test should outcome as tttttest", "tttttest", check);
    }
    @Test
    public void test_method2_best2(){
        String test = "apple cider";
        String check = task2.method2(test);

        assertNotNull(check);
        assertEquals("test should outcome as aaaaaaaaaaaapple cider", "aaaaaaaaaaaapple cider", check);
    }
    @Test
    public void test_method2_best3(){
        String test = "Raspberries";
        String check = task2.method2(test);

        assertNotNull(check);
        assertEquals("test should outcome as RRRRRRRRRRRRaspberries", "RRRRRRRRRRRRaspberries", check);
    }
    @Test
    public void test_method2_average(){
        String test = "";
        String check = task2.method2(test);

        assertNotNull(check);
        assertEquals("test should outcome as Empty String", "", check);
    }
    @Test
    public void test_method2_worst(){
        String test = null;
        String check = task2.method2(test);

        assertNotNull(check);
        assertEquals("test should outcome as Empty String", "", check);
    }
    @Test
    public void test_method3_best(){
        String test = "The quick brown fox jumped over the lazy dog";
        String check = task2.method3(test);

        assertNotNull(check);
        assertEquals("test should outcome as \"dog lazy the over jumped fox brown quick The\"",
                "dog lazy the over jumped fox brown quick The", check);
    }
    @Test
    public void test_method3_average(){
        String test = "";
        String check = task2.method3(test);

        assertNotNull(check);
        assertEquals("test should outcome as Empty String",
                "", check);
    }
    @Test
    public void test_method3_worst(){
        String test = null;
        String check = task2.method3(test);

        assertNotNull(check);
        assertEquals("test should outcome as Empty String",
                "", check);
    }

}
