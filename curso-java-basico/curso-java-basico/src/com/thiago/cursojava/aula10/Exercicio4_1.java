package com.thiago.cursojava.aula10;

import java.util.Scanner;

public class Exercicio4_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Sistema de calculo de medias");
        System.out.println("Informe nome do aluno a seguir: ");
        String nome = sc.nextLine();

        System.out.println("Informe a materia a seguir");
        String materia = sc.nextLine();

        System.out.println("Proximo passo informe as 4 notas do aluno");
        System.out.println("Informe a primeira nota do aluno");
        double nota1 = sc.nextDouble();

        System.out.println("Informe a segunda nota do aluno");
        double nota2 = sc.nextDouble();

        System.out.println("Informe a terceira nota do aluno");
        double nota3 = sc.nextDouble();

        System.out.println("Informe a quarta nota do aluno");
        double nota4 = sc.nextDouble();

        System.out.println("A seguir iremos calcular a media do aluno");
        double medianota = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.print("O aluno informado: ");
        System.out.println(nome);

        System.out.print("Matriculado na Materia: ");
        System.out.println(materia);

        System.out.print("Ficou com a média de: ");
        System.out.println(medianota);

        System.out.print("Finalizando o sistema de médias.");
    }
}
