package kata.range;

import kata.Range;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RangeTest {

    Range range = new Range();

    @Test public void
    start_with_inclusive() {
        range.of("[2,6]");
        assertTrue(range.startWithInclusive());
    }

    @Test public void
    start_with_exclusive() {
        range.of("(2,6]");
        assertFalse(range.startWithInclusive());
    }

    @Test public void
    end_with_inclusive() {
        range.of("[2,6]");
        assertTrue(range.endWithInclusive());
    }

    @Test public void
    end_with_exclusive() {
        range.of("[2,6)");
        assertFalse(range.endWithInclusive());
    }

    @Test public void
    start_number_with_inclusive() {
        range.of("[2,6]");
        assertEquals(2, range.startNumber());
    }

    @Test public void
    start_number_with_exclusive() {
        range.of("(2,6]");
        assertEquals(3, range.startNumber());
    }

    @Test public void
    end_number_with_inclusive() {
        range.of("(2,6]");
        assertEquals(6, range.endNumber());
    }

    @Test public void
    end_number_with_exclusive() {
        range.of("(2,6)");
        assertEquals(5, range.endNumber());
    }

    @Test public void
    show_all_number_in_set() {
        assertEquals("2,3,4,5,6", range.of("[2,6]"));
        assertEquals("3,4,5,6", range.of("(2,6]"));
        assertEquals("2,3,4,5", range.of("[2,6)"));
        assertEquals("3,4,5", range.of("(2,6)"));
    }

}
