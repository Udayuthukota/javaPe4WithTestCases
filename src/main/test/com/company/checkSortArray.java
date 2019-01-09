package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class checkSortArray {

    SortArray sortArray;
    @Before
    public void setUp() throws Exception {
        sortArray=new SortArray();
    }

    @After
    public void tearDown() throws Exception {
        sortArray=null;
    }

    String inputString="my name id uday";

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

    @Test
    public void testSortingAStringForNullInput()
    {
        ArrayList<String> expectedValue=new ArrayList<String >();
        ArrayList<String> actualValue=new ArrayList<String >();
       expectedValue=null;
        actualValue=sortArray.sortingAnStringArray(null);
        assertEquals(expectedValue,actualValue);
    }
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