package com.luiz;

import com.luiz.lista01.ExercicioDois;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double num;

        Scanner sc = new Scanner(System.in);
        ExercicioDois exDois = new ExercicioDois();

        System.out.print("Digite um numero: ");
        num = sc.nextDouble();

        if(exDois.isZero(num)){
            System.out.print("O numero "+num+" e zero");
        }else{
            System.out.print("O numero "+num+" nao e zero");
        }



    }
}