import org.junit.*;
import static org.junit.Assert.assertEquals;
public class JUnitTest {
    @Test
    public void test_maxInt()
    {
        int[] intArray = new int[]{1, 17, 89, 120, 15, 23};
        int[] emptyArray = new int[0];
        int[] nullArray = null;
        Integer expectedResult = 120;
        Integer actualResult = Finder.findMax(intArray);
        assertEquals(expectedResult, actualResult);
        expectedResult = null;
        actualResult = Finder.findMax(emptyArray);
        assertEquals(expectedResult, actualResult);
        actualResult = Finder.findMax(nullArray);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void test_minInt()
    {
        int[] intArray = new int[]{1, 17, 89, 120, 15, 23};
        int[] emptyArray = new int[0];
        int[] nullArray = null;
        Integer expectedResult = 1;
        Integer actualResult = Finder.findMin(intArray);
        assertEquals(expectedResult, actualResult);
        expectedResult = null;
        actualResult = Finder.findMax(emptyArray);
        assertEquals(expectedResult, actualResult);
        actualResult = Finder.findMax(nullArray);
        assertEquals(expectedResult, actualResult);
    }
}