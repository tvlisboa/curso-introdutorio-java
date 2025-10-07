package com.thiago.cursojava.aula10;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        /**
         * Insira o tamanho do raio
         * calcule a area e mostre na
         * tela
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho do raio a seguir: ");
        double raio = sc.nextDouble();

        double areaCirculo = Math.PI * raio * raio;

        System.out.println("A area do raio é " + areaCirculo);
    }
}
