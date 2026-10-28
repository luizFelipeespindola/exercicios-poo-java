package com.luiz;

import com.luiz.lista01.ExercicioUm;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double num;

        Scanner sc = new Scanner(System.in);
        ExercicioUm exUm = new ExercicioUm();

        System.out.print("Digite um numero: ");
        num = sc.nextDouble();

        if(exUm.isPositivo(num)){
            System.out.print("O numero "+num+" e positivo");
        }else{
            System.out.print("O numero "+num+" e negativo");
        }



    }
}