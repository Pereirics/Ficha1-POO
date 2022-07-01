package main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExerciciosTest {

    @Test
    void celsiusParaFarenheit() {
        int celsius = 30;
        int farenheit = 86;
        double test = Exercicios.celsiusParaFarenheit(celsius);
        assertEquals(farenheit, test, "Temperatura errada!");
    }

    @Test
    void maximoNumeros() {
        int maior = 3;
        int menor = 2;
        int test = Exercicios.maximoNumeros(maior, menor);
        assertEquals(maior, test, "Número errado!");
    }

    @Test
    void criaDescricaoConta() {
    }

    @Test
    void eurosParaLibras() {
    }

    @Test
    void mediaNumeros() {
    }

    @Test
    void factorial() {
        long factorial = 479001600;
        long test = Exercicios.factorial(12);
        assertEquals(factorial, test, "Valor errado!");
    }
}