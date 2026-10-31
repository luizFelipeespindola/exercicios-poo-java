package com.luiz;

import com.luiz.lista02.ExercicioSeis;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num1, num2,num3, menorNumero;

        ExercicioSeis exSeis = new ExercicioSeis();
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor inteiro: ");
        num1 = sc.nextInt();
        System.out.print("Digite outro valor inteiro: ");
        num2 = sc.nextInt();
        System.out.print("Digite outro valor inteiro: ");
        num3 = sc.nextInt();

        menorNumero = exSeis.verificarMenorNumero(num1,num2, num3);

        System.out.println("O menor numero é: "+ menorNumero);

    }
}