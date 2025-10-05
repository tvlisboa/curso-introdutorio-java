package com.thiago.cursojava.aula10;

public class Circuit {
    public static void main(String[] args) {


        /**
         * Utilizacao de curto circuito com operadores logicos
         * e é indicado usar oo && e || pois ja verificam a primeira situacao
         */

        boolean verdadeiro = true;
        boolean falso = false;
        boolean result1 = falso & verdadeiro;
        boolean result2 = falso && verdadeiro;
        System.out.println(result1);
        System.out.println(result2);
    }
}
