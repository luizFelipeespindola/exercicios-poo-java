package com.luiz;

import com.luiz.lista02.ExercicioOito;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String resposta;

        ExercicioOito exOito = new ExercicioOito();
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Gostaria de lançar um dado? [s/n]: ");
            resposta = sc.nextLine();

            if (resposta.equalsIgnoreCase("s")){
                System.out.println(exOito.jogarDado());
            }


        }while (resposta.equalsIgnoreCase("s"));

    }
}