package com.luiz;

import com.luiz.lista02.ExercicioQuatro;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num1, num2, menorNumero;

        ExercicioQuatro exTres = new ExercicioQuatro();
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor inteiro: ");
        num1 = sc.nextInt();
        System.out.print("Digite outro valor inteiro: ");
        num2 = sc.nextInt();

        menorNumero = exTres.verificarMenorNumero(num1,num2);

        System.out.println("O menor numero é: "+ menorNumero);

    }
}