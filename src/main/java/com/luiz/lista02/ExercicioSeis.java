package com.luiz.lista02;

public class ExercicioSeis {

    public int verificarMenorNumero(int num1, int num2){
            return Math.min(num1, num2);
    }

    public int verificarMenorNumero(int num1, int num2, int num3){
        return Math.min(verificarMenorNumero(num1,num2), num3);
    }

}
