package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HesaplamaTest {

    Hesaplama hesap = new Hesaplama();

    @Test
    void testTopla() {
        assertEquals(9, hesap.topla(4, 5));
    }

    @Test
    void testCikar() {
        assertEquals(3, hesap.cikar(8, 5));
    }

    @Test
    void testCarp() {
        assertEquals(12, hesap.carp(3, 4));
    }

    @Test
    void testBol() {
        assertEquals(5, hesap.bol(10, 2));
    }

    @Test
    void testBolSifira() {
        Exception exception = assertThrows(ArithmeticException.class, () -> hesap.bol(10, 0));
        assertEquals("Sıfıra bölünemez!", exception.getMessage());
    }
}
