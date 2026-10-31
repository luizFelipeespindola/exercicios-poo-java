package com.luiz;

import com.luiz.lista02.ExercicioCinco;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num1, num2,num3, maiorNumero;

        ExercicioCinco exCinco = new ExercicioCinco();
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor inteiro: ");
        num1 = sc.nextInt();
        System.out.print("Digite outro valor inteiro: ");
        num2 = sc.nextInt();
        System.out.print("Digite outro valor inteiro: ");
        num3 = sc.nextInt();

        maiorNumero = exCinco.verificarMaiorNumero(num1,num2, num3);

        System.out.println("O maior numero é: "+ maiorNumero);

    }
}