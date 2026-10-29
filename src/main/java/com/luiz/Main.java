package com.luiz;


import com.luiz.lista01.ExercicioQuatro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double a, b, c;

        Scanner sc = new Scanner(System.in);
        ExercicioQuatro exQuatro = new ExercicioQuatro();

        System.out.print("Digite o valor de a: ");
        a = sc.nextDouble();
        System.out.print("Digite o valor de b: ");
        b = sc.nextDouble();
        System.out.print("Digite o valor de c: ");
        c = sc.nextDouble();

        System.out.print("\nO valor de delta foi: "+exQuatro.calcularDelta(a,b,c));

    }
}