package com.factorial.operaciones.service;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OperacionesTest {
    private Operaciones operaciones;

    @BeforeEach
    public void setup() {
        operaciones = new MisOperaciones();
    }
    @Test
    public void factorialTest(){
        Assertions.assertEquals(operaciones.factorial(1), 1);
        Assertions.assertEquals(operaciones.factorial(4), 24);
        Assertions.assertEquals(operaciones.factorial(5), 120);
        Assertions.assertEquals(operaciones.factorial(0), 1);
    }

    @Test
    public void factorialFailTest(){
        Assertions.assertThrows(ArithmeticException.class,
                ()->{operaciones.factorial(-1);});

        Assertions.assertThrows(IllegalArgumentException.class,
                ()->{operaciones.factorial(24);});
    }
}
