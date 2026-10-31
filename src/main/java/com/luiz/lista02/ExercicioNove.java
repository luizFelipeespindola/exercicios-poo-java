package com.luiz.lista02;

import java.util.Random;

public class ExercicioNove {

    private final Random rd = new Random();

    public int jogarDado() {
        return rd.nextInt(6) + 1;
    }

    public int[] simularJogadas() {
        int[] resultados = new int[6];

        for (int i = 0; i < 1000000; i++) {
            int dado = jogarDado();
            resultados[dado - 1]++;
        }

        return resultados;
    }
}

