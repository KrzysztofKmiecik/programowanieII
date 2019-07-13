package Ex5SumLiczbZeStringa;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void sum_asss1b4_5() {
        Integer expected=5;
        Integer actual=Main.sum("sss1b4");

        assertEquals(expected,actual);

    }
}