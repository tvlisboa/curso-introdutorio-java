package exercicios;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = sc.nextLine();

        System.out.println("Informe a materia a seguir: ");
        String materia = sc.nextLine();

        System.out.println("Insira a primeira nota do aluno: ");
        double nota1 = sc.nextDouble();

        System.out.println("Insira a segunda nota do aluno: ");
        double nota2 = sc.nextDouble();

        double media = (nota1 + nota2) / 2;

        if(media >= 7) {
            System.out.println("O aluno foi aprovado");
        }else if(media < 7) {
            System.out.println("O aluno foi reprovado");
        }else if (media == 10){
            System.out.println("Aprovado com DISTINÇÃO");
        }
        System.out.print("O aluno informado:");
        System.out.print(" ");
        System.out.println(nome);

        System.out.print("Matriculado na materia:");
        System.out.print(" ");
        System.out.println(materia);

        System.out.print("Ficou com a média: ");
        System.out.print(" ");
        System.out.println(media);
    }
}
