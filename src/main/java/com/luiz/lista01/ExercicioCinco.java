package com.luiz.lista01;

public class ExercicioCinco {
    private double a;
    private  double b;
    private double c;

    public void setA(double a) {
        if (a == 0){
            System.out.println("O valor de A precisa ser diferente de ZERO");
            System.exit(1);
        }
        this.a = a;
    }

    public void setB(double b){
        this.b = b;
    }

    public void setC(double c){
        this.c = c;
    }

    public double calcularDelta(double a, double b, double c){
        return Math.pow(b,2) - 4*a*c;
    }

    public double[] calcularRaiz(){

        double[] raizes = new double[2];
        double delta = calcularDelta(a,b,c);

        raizes[0] = (-b + Math.sqrt(delta)) / (2 * a);
        raizes[1] = (-b - Math.sqrt(delta) )/ (2 * a);

        return raizes;
    }
}
