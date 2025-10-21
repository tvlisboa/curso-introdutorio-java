package com.thiago.cursojava.aula10;

import java.util.Scanner;

public class Exercicio13 {
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

        double salarioTotal = (valorHora * horasTrabalhada * diasTrabalhado * mesTrabalhado);
        double inss = (salarioTotal / 100) * 8;
        double sindicato = (salarioTotal / 100) * 5;
        double imposto = (salarioTotal / 100) * 11;
        double totalDesc = inss + sindicato + imposto;
        double salarioLiquido = salarioTotal - totalDesc;

        System.out.println("O funcionario: ");
        System.out.println(nomeFuncionario);

        System.out.println("Recebe o salario bruto de: ");
        System.out.println(salarioTotal);

        System.out.println("Valores de desconto abaixo: ");
        System.out.print("INSS: ");
        System.out.println(inss);
        System.out.print("SINDICATO: ");
        System.out.println(sindicato);
        System.out.print("IMPOSTO DE RENDA: ");
        System.out.println(imposto);
        System.out.print("TOTAL DE DESCONTO: ");
        System.out.println(totalDesc);

        System.out.println("O salrio LIQUIDO do funcionario: ");
        System.out.println(nomeFuncionario);
        System.out.println(salarioLiquido);
        sc.close();
    }
}
