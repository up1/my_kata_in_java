package kata;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiamondTest {

    Diamond diamond = new Diamond();

    @Test public void
    A_should_give_single_character() {
        assertEquals("A\n", diamond.create('A'));
    }

    @Test @Ignore public void
    B_should_give_character_sequence() {
        assertEquals("AB", diamond.create('B'));
    }

    @Test @Ignore public void
    B_should_give_repeat_characters() {
        assertEquals("ABB", diamond.create('B'));
    }

    @Test @Ignore public void
    B_should_separate_line() {
        assertEquals("A\nBB\n", diamond.create('B'));
    }

    @Test @Ignore public void
    B_should_add_indent_in_first_line() {
        assertEquals(" A\nBB\n", diamond.create('B'));
    }

    @Test @Ignore public void
    B_should_add_space_in_repeat_character() {
        assertEquals(" A\nB B\n", diamond.create('B'));
    }

    @Test public void
    B_should_b_a_diamon() {
        assertEquals(" A\nB B\n A\n", diamond.create('B'));
    }

    @Test public void
    C_should_show_bigger_diamond() {
        String diamondC = "  A\n"+
                          " B B\n"+
                          "C   C\n"+
                          " B B\n"+
                          "  A\n";
        assertEquals(diamondC, diamond.create('C'));
    }
    @Test public void
    D_should_show_bigger_diamond() {
        String diamondC = "   A\n"+
                          "  B B\n"+
                          " C   C\n"+
                          "D     D\n"+
                          " C   C\n"+
                          "  B B\n"+
                          "   A\n";
        assertEquals(diamondC, diamond.create('D'));
    }

}
