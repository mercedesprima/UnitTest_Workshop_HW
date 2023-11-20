package TaskTwo;

import org.junit.jupiter.api.Test;

import static TaskTwo.TaskTwo.numberInInterval;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestTaskTwo {

    @Test
    public void testNumberInInterval() {
        boolean result = numberInInterval(78);
        assertTrue(result);
    }
    @Test
    public void testNumberInIntervalLowLimit() {
        boolean result = numberInInterval(25);
        assertFalse(result);
    }
    @Test
    public void testNumberInIntervalUpperLimit() {
        boolean result = numberInInterval(100);
        assertFalse(result);
    }
    @Test
    public void testNumberInIntervalUnderLimit() {
        boolean result = numberInInterval(12);
        assertFalse(result);
    }
    @Test
    public void testNumberInIntervalUponLimit() {
        boolean result = numberInInterval(105);
        assertFalse(result);
    }
}
