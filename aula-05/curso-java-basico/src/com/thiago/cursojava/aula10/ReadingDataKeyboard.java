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
         * name, age, height, weight, status
         */

        System.out.println("Insira seu nome completo a seguir: ");
        String fullname = scanner.nextLine();

        System.out.println("Insira o primeiro nome a seguir ");
        String firstName = scanner.next();

        System.out.println("Insira o ultimo nome a seguir ");
        String lastName = scanner.next();

        System.out.println("Insira sua idade: ");
        int age = scanner.nextInt();

        System.out.println("Insira sua altura: ");
        double height = scanner.nextDouble();

        System.out.println("Insira sua peso: ");
        double weight = scanner.nextDouble();

        System.out.println("Qual seu estado civil? ");
        String status = scanner.next();


        System.out.println("#####----------#####");
        System.out.println("Iniciando o sistema para recolhimento de dados");
        System.out.println("Os dados informados do usuario foram: ");
        System.out.println("Ola : " + fullname + " Seja-bem vindo as primeiras aulas de javabasico");
        System.out.println("Primeiro nome do usuario: " + firstName);
        System.out.println("Ultimo nome do usuario: " + lastName);
        System.out.println("Idade do usario atualmente: " + age );
        System.out.println("Altura do usuario atualmente: " + height);
        System.out.println("Peso do usuario atualmente: " + weight);
        System.out.println("O estado civil atualmente: " + status);
        System.out.println("Obrigado por informar seus dados");
        System.out.println("Finalizando o processo de recolhimento de dados");
        System.out.println("#####----------#####");


    }
}
