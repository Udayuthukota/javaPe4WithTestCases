package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class checkTransposeOfStringTest
{
    TransposeOfString transposeOfString;
    @Before
    public void setUp() throws Exception {
        transposeOfString=new TransposeOfString();
    }

    @After
    public void tearDown() throws Exception {
        transposeOfString=null;
    }

    String inputString="I am uday uthukota";
    //pass code for sample input
    @Test
    public void testTransposeofStringSuccess()
    {
        String expectedValue="i ma yadu atokuhtu",actualValue;
        actualValue=transposeOfString.transpose(inputString);
        assertEquals(expectedValue,actualValue);
    }
    //fail code for sample input
    @Test
    public void testTransposeofStringFailure()
    {
        String expectedValue="i am yadu atokuhtu",actualValue;
        actualValue=transposeOfString.transpose(inputString);
        assertNotEquals(expectedValue,actualValue);
    }
    //when input is null
    @Test
    public void testTransposeofStringForNullInput()
    {
        String expectedValue=null,actualValue;
        actualValue=transposeOfString.transpose(null);
        assertEquals(expectedValue,actualValue);
    }
    //when input string in empty
    @Test
    public void testTransposeofStringForEmptyInput()
    {
        String expectedValue=null,actualValue;
        actualValue=transposeOfString.transpose(" ");
        assertEquals(expectedValue,actualValue);
    }

}