package tests;

import code.Lc1108_DefangingIpAddress;
import org.junit.Test;

import static org.junit.Assert.*;

public class Lc1108_DefangingIpAddressTest {

    @Test
    public void defangIPaddr() {
        Lc1108_DefangingIpAddress solution =
                new Lc1108_DefangingIpAddress();

        assertEquals(solution.defangIPaddr("1.1.1.1"), "1[.]1[.]1[.]1");
    }
}