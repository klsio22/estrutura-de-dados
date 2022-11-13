package Trabalho_1;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSearch {

    private Brute_Force bruteForce;

    @BeforeEach
    public void antesDeCadaTeste() {
        bruteForce = new Brute_Force();
    }

    @Test
    public void shouldSearchWord() {
        int count = 0;
        bruteForce.search("AABAACAADAABAABA", "AABA");
        assertEquals(Arrays.asList("Pattern found at index 0", "Pattern found at index 9", "Pattern found at index 12"), bruteForce.getValuesSearch());
    }


}
