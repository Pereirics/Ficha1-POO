package main;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @BeforeEach
    public void setUp() {

    }

    @AfterEach
    public void tearDown() {

    }

    @Test
    public void test1() {
        int a = 2;
        int b = 3;
        int esperado = a + b;
        int obtido = Main.soma(2, 3);
        assertEquals(esperado, obtido, "Valor da soma errado.");
    }
}