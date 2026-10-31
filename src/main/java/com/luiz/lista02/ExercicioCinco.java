package com.luiz.lista02;

public class ExercicioCinco {

    public int verificarMaiorNumero(int num1, int num2){
        return Math.max(num1, num2);
    }

    public int verificarMaiorNumero(int num1, int num2, int num3){
        return Math.max(verificarMaiorNumero(num1,num2), num3);
    }
}
