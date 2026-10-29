package com.luiz;

import com.luiz.lista01.ExercicioTres;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double num;

        Scanner sc = new Scanner(System.in);
        ExercicioTres exTres = new ExercicioTres();

        System.out.print("Digite um numero: ");
        num = sc.nextDouble();

        if(exTres.isZero(num)){
            System.out.print("O numero "+num+" e zero");
        }else if(exTres.isPositivo(num)){
            System.out.print("O numero "+num+" e positivo");
        }else{
            System.out.print("O numero "+num+" e negativo");
        }

    }
}