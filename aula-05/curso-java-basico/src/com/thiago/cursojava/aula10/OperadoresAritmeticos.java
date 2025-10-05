package com.thiago.cursojava.aula10;

public class OperadoresAritmeticos {
    public static void main(String[] args) {

        /**
         * Usando o operador de soma
         * para somar dois valores
         */

        int result = 2 + 1;
        System.out.println(result);

        result = result - 1;
        System.out.println(result);

        result = result * 2;
        System.out.println(result);

        result = result / 2;
        System.out.println(result);

        result = result + 8;
        System.out.println(result);

        result = result % 7;
        System.out.println(result);

        /**
         * Usando o operador soma
         * para concatenar duas strings
         */

        String firstString = "Exercicio sobre operadores logicos";
        String secondString = "Concatenando as strings declaraadas";
        String lastString = firstString + " " + secondString;
        System.out.println(lastString);

        /**
         * result = result + 1 é a mesma coisa que
         * result ++
         */

        result = result + 1;
        System.out.println(result);

        result ++;
        System.out.println(result);

        /**
         * result = result - 1 é a mesma coisa que
         * result --
         */

        result = result - 1;
        System.out.println(result);

        result --;
        System.out.println(result);

        System.out.println(result);

        result --;
        System.out.println(result);
    }
}
