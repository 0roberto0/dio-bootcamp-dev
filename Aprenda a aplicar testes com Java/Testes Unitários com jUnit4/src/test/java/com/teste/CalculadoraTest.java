package com.teste;

import static org.junit.Assert.*;

public class CalculadoraTest {

    @org.junit.Test

    public void testeSomar() {
        Calculadora calc = new Calculadora();
        int soma = calc.somar("1+1+3");
        assertEquals(5, soma);
    }
}