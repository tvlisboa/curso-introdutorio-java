package aula15;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o nome do aluno");
        String nome = sc.nextLine();

        System.out.println("Informe a seguir as notas do aluno.");
        System.out.println("Nota 1: ");
        double nota1 = sc.nextDouble();

        System.out.println("Nota 2: ");
        double nota2 = sc.nextDouble();

        System.out.println("Nota 3: ");
        double nota3 = sc.nextDouble();

        System.out.println("Nota 4: ");
        double nota4 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        if(media == 10){
            System.out.println("Aprovado com DISTINÇÃO");
        } else if (media >= 7.0) {
            System.out.println("Aluno aprovado");
        } else if (media <= 7.0) {
            System.out.println("Aluno reprovado");
        }
        System.out.println("O aluno informado: " +nome);
        System.out.println("Ficou com a média: " +media);
        System.out.println();
        sc.close();
    }
}
