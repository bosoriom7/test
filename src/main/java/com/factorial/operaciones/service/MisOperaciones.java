package com.factorial.operaciones.service;

import org.springframework.stereotype.Service;

@Service
public class MisOperaciones implements Operaciones{

    @Override
    public int factorial(int num) {
        //n -> n * (n-1) * (n-2)....*1
        //n >=0

        if (num < 0){
            throw new ArithmeticException();
        }

        //De 24 para arriba el factorial es negativo y esto no es correcto
        if (num > 23){
            throw new IllegalArgumentException("Overflow from integer");
        }
        if (num == 1 || num == 0) return 1;
        return num * factorial(num - 1);
    }
}
