package com.thiago.cursojava.aula10;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura: ");
        double tempFare = sc.nextDouble();

        double tempCelsius = (5 *(tempFare - 32 ) /9);


        System.out.println("A temperatura informada foi");
        System.out.println(tempFare);

        System.out.println("A temperatura em Celsius é: ");
        System.out.println(tempCelsius);
    }
}
