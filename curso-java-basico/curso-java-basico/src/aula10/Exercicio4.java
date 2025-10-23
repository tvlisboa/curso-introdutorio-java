package aula10;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        /**
         * Pedir ao usuario
         * Nome do aluno - ok
          * Materia do aluno - ok
         * 4 notas bimestras do aluno - ok
         * Calcular a media das notas
         * e mostrar na tela de saida
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Exercicio 4");
        System.out.println("Insira o nome do aluno");
        String nomeAluno = sc.nextLine();

        System.out.println("Insira a materia do aluno");
        String materiaColegio = sc.nextLine();

        System.out.println("Insira as 4 notas do aluno a Seguir");
        System.out.println("###################################");

        System.out.println("Insira a primeira nota");
        double nota1 = sc.nextFloat();

        System.out.println("Insira a segunda nota");
        double nota2 = sc.nextFloat();

        System.out.println("Insira a terceira nota");
        double nota3 = sc.nextFloat();

        System.out.println("Insira a quarta nota");
        double nota4 = sc.nextFloat();
        double mediaAluno = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("Materia informada no periodo: " +materiaColegio);
        System.out.println("A media informada do aluno:"
                + nomeAluno + "Foi:"
                + mediaAluno);
    }
}
