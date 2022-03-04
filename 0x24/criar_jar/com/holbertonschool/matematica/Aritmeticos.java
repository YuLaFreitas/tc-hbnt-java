package com.holbertonschool.matematica;

public class Aritmeticos {

    public static int somar(int x, int y){
        return x+y;
    }

    public static int subtrair(int x, int y){
        return x-y;
    }
    public static int multiplicar(int x, int y){
        return x*y;
    }

    public int dividir(int x, int y){
        return y != 0? x/y : 0;
    }
}
