package com.luiz.lista02;

import java.util.Random;

public class ExercicioOito {

    private final Random rd = new Random();

    public int jogarDado() {
        return rd.nextInt(6) + 1;
    }
}
