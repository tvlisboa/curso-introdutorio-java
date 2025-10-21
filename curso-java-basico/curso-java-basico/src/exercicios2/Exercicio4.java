package exercicios2;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o nome do aluno a seguir: ");
        String nome = sc.nextLine();

        System.out.println("Insira a materia a seguir: ");
        String materia = sc.nextLine();

        System.out.println("Insira agora as 4 notas do aluno: ");
        System.out.println("Nota 1");
        double nota1 = sc.nextDouble();

        System.out.println("Nota 2");
        double nota2 = sc.nextDouble();

        System.out.println("Nota 3");
        double nota3 = sc.nextDouble();

        System.out.println("Nota 4");
        double nota4 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("O aluno informado: ");
        System.out.println(nome);

        System.out.println("Matriculado na matéria: ");
        System.out.println(materia);

        System.out.println("Com as notas informdaas a seguir: ");
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Nota 3: " + nota3);
        System.out.println("Nota 4: " + nota4);

        System.out.println("Ficou com a média: ");
        System.out.println(media);
        sc.close();
    }
}
