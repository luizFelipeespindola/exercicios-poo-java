package com.luiz;

import com.luiz.lista02.ExercicioSete;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numero, menorNumero;
        String resposta;

        ExercicioSete exSete = new ExercicioSete();
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        numero = sc.nextInt();

        menorNumero = numero;

        do {

            System.out.print("Gostaria de continuar? [s/n]: ");
            sc.nextLine();
            resposta = sc.nextLine();

            if(resposta.equalsIgnoreCase("s")){
                System.out.print("Digite um numero inteiro: ");
                numero = sc.nextInt();

                menorNumero = exSete.verificarMenorNumero(numero, menorNumero);
            }

        } while(resposta.equalsIgnoreCase("s"));

        System.out.print("\nMenor numero digitado foi: " + menorNumero);


    }
}