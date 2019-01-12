package com.stackroute.pe4;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class checkOccuranceOfChar
 {
    OccuranceOfChar occuranceOfChar;
    @Before
    public void setUp()
    {
        occuranceOfChar=new OccuranceOfChar();
    }
    @After
    public void tearDown()
    {
        occuranceOfChar=null;
    }
    String inputString="java count occurences of java";
    String inputChar="j";
    //pass case
    @Test
    public void testOccuranceOfCharSuccess()
    {
        String expectedValue="2",actualValue;
        actualValue=occuranceOfChar.occuranceOfCharInString(inputChar,inputString);
        assertEquals(expectedValue,actualValue);
    }
    //failurecase
    @Test
    public void testOccuranceOfCharFailure()
    {
        String expectedValue="1",actualValue;
        actualValue=occuranceOfChar.occuranceOfCharInString(inputChar,inputString);
        assertNotEquals(expectedValue,actualValue);
    }

    //pass case
    @Test
    public void testOccuranceOfCharForSpecialCharInput()
    {
        String inputCharone="@";
        String expectedValue="Enter other Character",actualValue;
        actualValue=occuranceOfChar.occuranceOfCharInString(inputCharone,inputString);
        assertEquals(expectedValue,actualValue);
    }
    //pasecase
    @Test
    public void testOccuranceOfCharrForEmptyCharInput()
    {
        String inputCharTwo=" ";
        String expectedValue="Enter other Character",actualValue;
        actualValue=occuranceOfChar.occuranceOfCharInString(inputCharTwo,inputString);
        assertEquals(expectedValue,actualValue);
    }
    //pass case
    @Test
    public void testOccuranceOfCharForNullString()
    {
        String inputStringTwo=null;
        String inputCharTwo="a";
        String expectedValue=null,actualValue;
        actualValue=occuranceOfChar.occuranceOfCharInString(inputCharTwo,inputStringTwo);
        assertEquals(expectedValue,actualValue);
    }
 }