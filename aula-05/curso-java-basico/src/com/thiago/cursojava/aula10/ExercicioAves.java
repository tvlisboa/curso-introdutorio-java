package com.thiago.cursojava.aula10;


import java.util.Scanner;

/**
 * Solicitar ao usuario para
 *
 * Informar a quantidade de aves - ok
 * informar quantos dias tem o mes - ok
 * Informar peso medio das aves - ok
 * Quantidade de vezes alimentada por dia - ok
 * Quantidade de racao alimentada por vez - ok
 * saber quantidade de racao por dia gasta - ok
 * saber quantidade por semana gasta, sendo que sao 7 dias - ok
 * informar a quantidade de racao gasta por mes - ok
 * quantidade de racao que compra - ok
 * Valor da racao gasta - ok
 */

public class ExercicioAves {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("SCPaA - Sistema de Calculos para Alimentacao de AVES");

        /**
         * Quantidade de aves que possui
         */

        System.out.println("Informe a quantidade de aves que possui a seguir: ");
        int quantAves = sc.nextInt();

        /**
         * Quantidade de dias tem o mes
         */

        System.out.println("Digite a quantidade de dias do mes a seguir: ");
        int quantDias = sc.nextInt();

        /**
         * Informa o valor pago
         */

        System.out.println("Qual o valor da ração paga? ");
        double valorPago = sc.nextDouble();

        /**
         * Informa quantidade de racao paga
         */

        System.out.println("Quantos KGS de ração é pago? ");
        int kilosRacao = sc.nextInt();

        /**
         * Peso médio das aves
         */

        System.out.println("Informe a media de peso de cada ave a seguir: ");
        double pesoAves = sc.nextDouble();

        /**
         * Quantidade de vezes diaria de alimentação
         */

        System.out.println("Informe a quantidade de vezes que alimenta as aves diariamente: ");
        int vezesAlimenta = sc.nextInt();

        /**
         * Quantidade em grama de cada refeicao
         */

        System.out.println("Informe em gramas que é inserida por refeição: ");
        double gramaRefeicao = sc.nextDouble();

        /**
         * Variaveis para calculos
         */

        double quantiDiaria = quantAves * vezesAlimenta * gramaRefeicao;
        double quantSemana = quantiDiaria * 7;
        double gramaMes = quantSemana * quantDias;

        System.out.println("Quantidade diaria de ração gasta em KGS: ");
        System.out.println(quantiDiaria);

        System.out.println("Quantidade semanal de racao gasta em KGS: ");
        System.out.println(quantSemana);

        System.out.println("Quantidade mensal de racao gasta em KGS");
        System.out.println(gramaMes);
        sc.close();
    }
}
