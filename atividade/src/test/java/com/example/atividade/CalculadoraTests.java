package com.example.atividade;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculadoraTests {
    Calculadora calculadora;
    Double n1 = 14D;
    Double n2 = 76D;
    Double result;

    @BeforeEach
    public void setup() {
        calculadora = new Calculadora();
    }

    @Test
    @DisplayName("Teste de Aprovação :D - Soma")
    public void TestSum() {
        result = calculadora.soma(n2, n1);

        assertEquals(n1 + n2, result);
    }

    @Test
    @DisplayName("Teste feliz - subtração")
    public void TestSub() {
        result = calculadora.subtracao(n1,n2);
        assertEquals(n1 - n2, result);
    }

    @DisplayName("Teste de aprovação - Multiplicação")
    @Test
    void TestMultiplicacao() {
        result = calculadora.multiplicacao(n2, n1);
        assertEquals(n2*n1, result);
    }

    @DisplayName("Teste de aprovação - Divisão")
    @Test
    void TestDivisao() {
        result = calculadora.divisao(n2, n1);
        assertEquals(n2 / n1, result);
    }

    @DisplayName("Teste de excessão ")
    @Test
    void TesteExcessao(){
        Double n1 = 50D;
        Double n2 = 0D;
        ArithmeticException result = assertThrows(ArithmeticException.class, ()->{
            calculadora.divisao(n1, n2);
        });

        assertEquals("Impossible to divide by zero!", result.getMessage());
    }
}
