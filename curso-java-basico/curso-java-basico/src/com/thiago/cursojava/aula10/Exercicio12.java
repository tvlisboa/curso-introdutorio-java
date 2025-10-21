package com.thiago.cursojava.aula10;
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Sistema de PESO ideal - SPI ") ;

        System.out.println("Digite seu nome a seguir: ");
        String nome = sc.nextLine();

        System.out.println("Insira sua altura: ");
        double altura = sc.nextDouble();

        double pesoIdeal = (72.7 * altura) - 58;

        System.out.println("O usuario informado: " + nome);
        System.out.println("Tem a faixa de PESO IDEAL:" + pesoIdeal);
        System.out.println("Obrigado por usar nosso sistema...");
        System.out.println("Saindo do sistema SPI");
        sc.close();
    }
}
