package com.stackroute.pe4;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class checkReplaceingchar
{

    Replacingchar replaceingchar;
    @Before
    public void setUp()
    {
        replaceingchar=new Replacingchar();
    }
    @After
    public void tearDown()
    {
        replaceingchar=null;
    }

    String inputString="daily dry";
    //pass case for input one
    @Test
    public void testReplacingSuccess()
    {
        String expectedValue="fatly fry",actualValue;
        actualValue=replaceingchar.replaceChar(inputString);
        assertEquals(expectedValue,actualValue);
    }
    //failure case for input
    @Test
    public void testReplacingFailure()
    {
        String expectedValue="datly fry",actualValue;
        actualValue=replaceingchar.replaceChar(inputString);
        assertNotEquals(expectedValue,actualValue);
    }

    @Test
    public void testReplacingNullCondition()
    {
        String expectedValue=null,actualValue;
        actualValue=replaceingchar.replaceChar(null);
        assertEquals(expectedValue,actualValue);
    }
    //when input is empty string
    @Test
    public void testReplacingEmptyString()
    {
        String expectedValue=null,actualValue;
        actualValue=replaceingchar.replaceChar(" ");
        assertEquals(expectedValue,actualValue);
    }
}