package aula15;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Nome do usuario: ");
        String nome = sc.nextLine().toUpperCase();

        System.out.println("Informe o turno a seguir: ");
        System.out.println("OPCOES: ");
        System.out.println("M - MATUTINO");
        System.out.println("V - VESPERTINO");
        System.out.println("N - NOTURNO");
        String turno = sc.nextLine().toUpperCase();

        switch (turno) {
            case "M":
                System.out.println("O turno escolhido é: " +turno);
                System.out.println("Bom dia." +nome);
                break;
            case "V":
                System.out.println("O turno escolhido é: " +turno);
                System.out.println("Boa tarde." +nome);
                break;
            case "N":
                System.out.println("O turno escolhido é: " +turno);
                System.out.println("Boa noite." +nome);
                break;
            default:
                System.out.println("Opcao informada é invalida");
                break;
        }
        sc.close();
    }
}
