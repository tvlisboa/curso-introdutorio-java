package aula15;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o nome do aluno.");
        String nomeAluno = sc.nextLine().toUpperCase();

        System.out.println("Insira a materia a seguir.");
        String materiaAluno = sc.nextLine().toUpperCase();

        System.out.println("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        double media = (nota1 + nota2) / 2;
        String conceito;

        if(media > 9.0 && media < 10.0){
            conceito = "A";
        } else if (media > 7.5 && media <= 9.0) {
            conceito = "B";
        } else if (media > 6.0 && media <= 7.5) {
            conceito = "C";
        } else if (media > 4.0 && media <= 6.0) {
            conceito = "D";
        }else{
            conceito = "E";
        }

        System.out.println("O aluno: " + nomeAluno);
        System.out.println("Matriculado na matéria: " + materiaAluno);
        System.out.println("Ficou com as seguintes notas: ");
        System.out.println("Nota 1 : " + nota1);
        System.out.println("Nota 2 : " + nota2);
        System.out.println("E com a média de : " + media);
        System.out.println("Seu conceito foi : " + conceito);

        switch(conceito){
            case "A":
            case "B":
            case "C":
                System.out.println("Aluno Aprovado");
                break;
            case "D":
            case "E":
                System.out.println("Aluno Reprovado");
                break;
                default:
                System.out.println("Informe uma opcao valida.");
        }
        sc.close();
    }
}
