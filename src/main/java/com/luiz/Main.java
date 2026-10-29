package com.luiz;


import com.luiz.lista01.ExercicioCinco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double a, b, c;

        Scanner sc = new Scanner(System.in);
        ExercicioCinco exCinco = new ExercicioCinco();

        System.out.print("Digite o valor de a: ");
        exCinco.setA(a = sc.nextDouble());
        System.out.print("Digite o valor de b: ");
        exCinco.setB(b = sc.nextDouble());
        System.out.print("Digite o valor de c: ");
        exCinco.setC(c = sc.nextDouble());

        System.out.print("Valor de delta: "+exCinco.calcularDelta(a,b,c));


        if (exCinco.calcularDelta(a,b,c) < 0){
            System.out.println("\nRaizes complexas 0");
        }else{
            double[] raizes = exCinco.calcularRaiz();

            System.out.print("\nValor da raiz 1 = " + raizes[0]);
            System.out.print("\nValor da raiz 2 = " + raizes[1]);
        }


    }
}