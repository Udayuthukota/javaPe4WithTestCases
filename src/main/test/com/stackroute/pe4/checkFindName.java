package com.stackroute.pe4;
import com.stackroute.pe4.FindName;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
   public class checkFindName
   {

                FindName findName;
                @Before
                public void setUp() {

                    findName = new FindName();
                }
                @After
                public void tearDown()
                {
                    findName = null;
                }
                String inputString = "hello harry how are you";
                //pass case
                @Test
                public void testfindNameHarrySuccess() {
                    String expectedValue = "Is Harry here ? true", actualValue;
                    actualValue = findName.findNameHarry(inputString);
                    assertEquals(expectedValue, actualValue);
                }
                //pass case for input two
                @Test
                public void testfindNameHarrySuccessone() {
                    String inputStringone = "hello how are you";
                    String expectedValue = "Harry here ? false", actualValue;
                    actualValue = findName.findNameHarry(inputStringone);
                    assertEquals(expectedValue, actualValue);
                }
                //fail case for input1
                @Test
                public void testfindNameHarryFailure() {
                    String expectedValue = "Is Harry here ? false", actualValue;
                    actualValue = findName.findNameHarry(inputString);
                    assertNotEquals(expectedValue, actualValue);
                }
                //If input is null
                @Test
                public void testfindNameHarryNullCondition() {
                    String expectedValue = null, actualValue;
                    actualValue = findName.findNameHarry(null);
                    assertEquals(expectedValue, actualValue);
                }
                //if input is a empty string
                @Test
                public void testfindNameHarryEmptyString() {
                    String expectedValue = null, actualValue;
                    actualValue = findName.findNameHarry(" ");
                    assertEquals(expectedValue, actualValue);
                }
}