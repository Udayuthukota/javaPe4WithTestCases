import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class checkMatcherFind{


    MatcherFind obj;

    @Before
    public void setUp() {
        obj = new MatcherFind();
    }

    @After
    public void tearDown() {
        obj = null;
    }



    @Test
    public void testMatchSuccess() {
        String inputString1 = "She sells seashells by the seashore";
        String inputString2 = "se";
        String expectedValue = "Found at:4-6\n" + "Found at:10-12\n" + "Found at:27-29" , actualValue;
        actualValue = obj.matcher(inputString1,inputString2);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testMatchFailure() {
        String inputString1 = "She sells seashells by the seashore";
        String inputString2 = "sea";
        String expectedValue = "nan is good", actualValue;
        actualValue = obj.matcher(inputString1,inputString2);
        assertNotEquals(expectedValue, actualValue);
    }


    @Test
    public void testMatchRetuenNull() {
        String inputString1 = "She sells seashells by the seashore";
        String inputString2 = null;
        String expectedValue =null, actualValue;
        actualValue = obj.matcher(inputString1,inputString2);
        assertEquals(expectedValue, actualValue);
    }




}