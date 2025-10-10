package com.thiago.cursojava.aula10;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a temperatura: ");
        double tempCel = sc.nextDouble();

        double tempFa = (tempCel * 1.8) + 32;

        System.out.println("A temperatura informada foi: ");
        System.out.println(tempCel);

        System.out.println("A temperatura em Fa é: ");
        System.out.println(tempFa + "Fa");
    }
}
