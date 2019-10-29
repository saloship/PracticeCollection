package tests;

import code.Lc760_FindAnagramMapping;
import org.junit.Test;

import static org.junit.Assert.*;

public class Lc760_FindAnagramMappingTest {

    @Test
    public void anagramMappings() {
        int[] A = {12, 28, 46, 32, 50};
        int[] B = {50, 12, 32, 46, 28};

        Lc760_FindAnagramMapping solution = new Lc760_FindAnagramMapping();

        assertArrayEquals(solution.anagramMappings(A, B), new int[]{1, 4, 3, 2, 0});

    }
}