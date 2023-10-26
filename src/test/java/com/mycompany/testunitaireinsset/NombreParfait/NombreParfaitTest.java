package com.mycompany.testunitaireinsset.NombreParfait;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class NombreParfaitTest {

    @Test
    public void testEstDivisiblePar() {
        Parfait instance = new Parfait();
        boolean result = instance.estDivisiblePar(5, 10);
        assertEquals(true, result);
    }

    public long[] diviseurs(long val) {
    List<Long> diviseursList = new ArrayList<>();

    for (long i = 1; i <= val; i++) {
        if (val % i == 0) {
            diviseursList.add(i);
        }
    }

    long[] diviseursArray = new long[diviseursList.size()];

    for (int i = 0; i < diviseursList.size(); i++) {
        diviseursArray[i] = diviseursList.get(i);
    }

    return diviseursArray;
}

    @Test
    public void testEstParfaitOK() {
        Parfait instance = new Parfait();
        boolean result = instance.estParfait(28);
        assertEquals(true, result);
    }

    @Test
    public void testEstParfaitNOK() {
        Parfait instance = new Parfait();
        boolean result = instance.estParfait(11);
        assertEquals(false, result);
    }
}