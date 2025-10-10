package com.thiago.cursojava.aula10;

import java.util.Scanner;


/**
 * Inserir o valor por hora ganho
 * Inserir quantas horas trabalha por dia
 * Inserir quantos dias trabalha por semana
 * Multiplicar por quantas semnas sao
 *
 */

public class Exercicio8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do funcionario: ");
        String nomeFuncionario = sc.nextLine();

        System.out.println("Insira o valor pago por hora: ");
        double valorHora = sc.nextDouble();

        System.out.println("Horas trabalhadas diariamente: ");
        double horasTrabalhada = sc.nextDouble();

        System.out.println("Dias da semana trabalhado: ");
        double diasTrabalhado = sc.nextDouble();

        System.out.println("Semanas trabalhadas no mes: ");
        double mesTrabalhado = sc.nextDouble();

        double valorMes = (valorHora * horasTrabalhada * diasTrabalhado * mesTrabalhado);

        System.out.println("O funcionario: ");
        System.out.println(nomeFuncionario);
        System.out.println("Recebe o salario liquido : ");
        System.out.println(valorMes);
    }
}
