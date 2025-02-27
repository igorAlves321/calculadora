package com.programando.calculadora;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    private final Calculadora calculadora = new Calculadora();

    @Test
    @DisplayName("Testar a adição")
    void somar() {
        assertEquals(10, calculadora.somar(5, 5), "Erro na soma");
    }

    @Test
    @DisplayName("Testar a subtração")
    void subtrair() {
        assertEquals(3, calculadora.subtrair(5, 2), "Erro na subtração");
    }

    @Test
    @DisplayName("Testar a multiplicação")
    void multiplicar() {
        assertEquals(15, calculadora.multiplicar(3, 5), "Erro na multiplicação");
    }

    @Test
    @DisplayName("Testar a divisão")
    void dividir() {
        assertEquals(2.5, calculadora.dividir(5, 2), 0.0001, "Erro na divisão");
    }

    @Test
    @DisplayName("Testar a divisão por zero")
    void dividirPorZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> calculadora.dividir(5, 0));
        assertEquals("Divisão por zero não é permitida", exception.getMessage());
    }

    // 🚀 **Novos testes para cobrir mais cenários**

    @Test
    @DisplayName("Testar soma com zero")
    void somarComZero() {
        assertEquals(5, calculadora.somar(5, 0), "Erro na soma com zero");
    }

    @Test
    @DisplayName("Testar subtração com zero")
    void subtrairComZero() {
        assertEquals(5, calculadora.subtrair(5, 0), "Erro na subtração com zero");
    }

    @Test
    @DisplayName("Testar multiplicação por um")
    void multiplicarPorUm() {
        assertEquals(7, calculadora.multiplicar(7, 1), "Erro na multiplicação por um");
    }

    @Test
    @DisplayName("Testar divisão por um")
    void dividirPorUm() {
        assertEquals(8, calculadora.dividir(8, 1), "Erro na divisão por um");
    }

    @Test
    @DisplayName("Testar divisão com resultado decimal longo")
    void dividirDecimalLongo() {
        assertEquals(3.3333, calculadora.dividir(10, 3), 0.0001, "Erro na divisão com número decimal longo");
    }

    @Test
    @DisplayName("Testar multiplicação por número negativo")
    void multiplicarNegativo() {
        assertEquals(-20, calculadora.multiplicar(4, -5), "Erro na multiplicação com número negativo");
    }

    @Test
    @DisplayName("Testar soma de dois números negativos")
    void somarNegativos() {
        assertEquals(-15, calculadora.somar(-10, -5), "Erro na soma de dois números negativos");
    }

    @Test
    @DisplayName("Testar subtração de dois números negativos")
    void subtrairNegativos() {
        assertEquals(-5, calculadora.subtrair(-10, -5), "Erro na subtração de dois números negativos");
    }

    @Test
    @DisplayName("Testar multiplicação de zero por zero")
    void multiplicarZeroZero() {
        assertEquals(0, calculadora.multiplicar(0, 0), "Erro na multiplicação de zero por zero");
    }
}
