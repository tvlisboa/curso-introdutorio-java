package com.thiago.cursojava.aula10;

import java.util.Scanner;

public class ReadingDataKeyboard {
    public static void main(String[] args) {

        /**
         * Instanciando uma nova classe do scanner,
         * que sera usado para receber dados
         * do usuario
         */

        Scanner scanner = new Scanner(System.in);

        /**
         * Solicitado ao usuario, para inserir seus dados
         * nome, idade, altura, peso e estado civil
         */

        System.out.println("Insira seu nome a seguir: ");
        String nome = scanner.nextLine();

        System.out.println("Insira sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Insira sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Insira sua peso: ");
        double peso = scanner.nextDouble();

        System.out.println("Qual seu estado civil? ");
        String estadoCivil = scanner.next();


        System.out.println("-----------------------------");
        System.out.println("Iniciando o sistema para recolhimento de dados");
        System.out.println("Os dados informados do usuario foram: ");
        System.out.println("Ola : " + nome + " Seja-bem vindo as primeiras aulas de javabasico");
        System.out.println("Idade do usario atualmente: " + idade);
        System.out.println("Altura do usario atualmente: " + altura);
        System.out.println("Peso do usario atualmente: " + peso);
        System.out.println("O estado atualmente: " + estadoCivil);
        System.out.println("Finalizando o processo de recolhimento de dados");
        System.out.println("-----------------------------");


    }
}
