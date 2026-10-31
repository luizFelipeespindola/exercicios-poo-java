package com.luiz;

import com.luiz.lista02.ExercicioNove;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ExercicioNove exNove = new ExercicioNove();

        int[] resultados = exNove.simularJogadas();

        for(int i = 0; i < resultados.length; i++){

            double porcentagem = resultados[i] / 10000.0;

            System.out.printf("%d: %d - %.2f%%%n",i + 1, resultados[i], porcentagem);
        }

    }
}