package Modul1;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Tugas4Test {

    @Test
    public void testFindMinScenario1() {
        assertEquals(1, Tugas4.findMin(1, 2, 3));
    }

    @Test
    public void testFindMinScenario2() {
        assertEquals(-3, Tugas4.findMin(-1, -2, -3));
    }

    @Test
    public void testFindMinScenario3() {
        assertEquals(0, Tugas4.findMin(0, 0, 1));
    }
}