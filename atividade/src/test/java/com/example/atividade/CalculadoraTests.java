package com.example.atividade;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculadoraTests {
    Calculadora calculadora;
    Double n1 = 14D;
    Double n2 = 76D;

    @BeforeEach
    public void setup() {
        calculadora = new Calculadora();
    }

    @Test
    @DisplayName("Teste de Aprovação :D - Soma")
    public void TestSum() {
        Double result = calculadora.soma(n2, n1);

        assertEquals(n1+n2, result);
    }
}
