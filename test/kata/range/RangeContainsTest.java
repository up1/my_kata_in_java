package kata.range;

import kata.Range;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RangeContainsTest {

    @Test public void
    contains_in_set() {
        Range set1 = new Range("[2,6)");
        assertTrue(set1.contain(2, 4));
    }

    @Test public void
    contains_all_number_in_set() {
        Range set1 = new Range("[2,6)");
        assertTrue(set1.contain(2, 3, 4, 5));
    }

    @Test public void
    not_contains_in_set() {
        Range set1 = new Range("[2,6)");
        assertFalse(set1.contain(-1, 1, 6, 10));
    }

}
