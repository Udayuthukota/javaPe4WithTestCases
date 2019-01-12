package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;
public class checkSortArray
{

    SortArray sortArray;
    @Before
    public void setUp() throws Exception
    {
        sortArray=new SortArray();
    }
    @After
    public void tearDown() throws Exception {
        sortArray=null;
    }
    String inputString="my name id uday";
    //pass code fot someinput
    @Test
    public void testSortingAStringArrySuccess()
    {
        ArrayList<String> expectedValue=new ArrayList<String >();
        ArrayList<String> actualValue=new ArrayList<String >();
        expectedValue.add("id");
        expectedValue.add("my");
        expectedValue.add("name");
        expectedValue.add("uday");
         //actualValue;
        actualValue=sortArray.sortingAnStringArray(inputString);
        assertEquals(expectedValue,actualValue);
    }
    //fail case for some input
    @Test
    public void testSortingAStringArryFailure()
    {
        ArrayList<String> expectedValue=new ArrayList<String >();
        ArrayList<String> actualValue=new ArrayList<String >();
        expectedValue.add("my");
        expectedValue.add("id");
        expectedValue.add("name");
        expectedValue.add("uday");
        actualValue=sortArray.sortingAnStringArray(inputString);
        assertNotEquals(expectedValue,actualValue);
    }
    //Checking for null input
    @Test
    public void testSortingAStringForNullInput()
    {
        ArrayList<String> expectedValue=new ArrayList<String >();
        ArrayList<String> actualValue=new ArrayList<String >();
       expectedValue=null;
        actualValue=sortArray.sortingAnStringArray(null);
        assertEquals(expectedValue,actualValue);
    }
    //Checking when  input is empty string
    @Test
    public void testSortingAStringForEmptyInput()
    {
        ArrayList<String> expectedValue=new ArrayList<String >();
        ArrayList<String> actualValue=new ArrayList<String >();
        expectedValue=null;
        actualValue=sortArray.sortingAnStringArray(" ");
        assertEquals(expectedValue,actualValue);
    }
}