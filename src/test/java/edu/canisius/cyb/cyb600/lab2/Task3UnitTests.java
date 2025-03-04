package edu.canisius.cyb.cyb600.lab2;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;


public class Task3UnitTests {
    private Task3 task3;

    @Before
    /*
    STUDENTS SHOULD NOT BE CHANGING THIS METHOD.
     */
    public void setUp() {
        this.task3 = new Task3();
    }

    @Test
    public void test_removeDuplicates_best(){
        String input = "aabcc";
        ArrayList<String> result = task3.removeDuplicates(input);
        assertNotNull(result);
        assertEquals( "The result should contain unique characters.", 3, result.size());
        assertTrue(result.contains("a"));
        assertTrue(result.contains("b"));
        assertTrue(result.contains("c"));
    }

    @Test
    public void test_removeDuplicates_average(){
        ArrayList<String> result = task3.removeDuplicates("");
        assertNotNull(result);
        assertTrue("The result should be empty for empty string." , result.isEmpty());
    }

    @Test
    public void test_removeDuplicates_worst(){
        ArrayList<String> result = task3.removeDuplicates(null);
        assertNotNull(result);
        assertTrue("The result should be empty for null input." , result.isEmpty());
    }

    @Test
    public void test_areTheseAnagrams_best(){
        String str1 = "listen";
        String str2 = "silent";
        assertTrue("The strings should be anagrams." , task3.areTheseAnagrams(str1, str2));
    }

    @Test
    public void test_areTheseAnagrams_average(){
        String str1 = "";
        String str2 = "";
        assertTrue("Two empty strings should be considered anagrams.", task3.areTheseAnagrams(str1, str2));
    }

    @Test
    public void test_areTheseAnagrams_worst(){
        assertFalse( "Null input should return false.", task3.areTheseAnagrams(null, "test"));
        assertFalse("Null input should return false.", task3.areTheseAnagrams("test", null));
        assertFalse("Null input should return false.", task3.areTheseAnagrams(null, null));
    }

}
