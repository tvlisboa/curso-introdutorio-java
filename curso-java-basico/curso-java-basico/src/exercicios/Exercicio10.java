package exercicios;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o turno a seguir: ");
        System.out.println("M - Matutino");
        System.out.println("V - Vespertino");
        System.out.println("N - Noturno");
        String turno = sc.nextLine().toUpperCase();

        switch (turno) {
            case "M": System.out.println("Bom Dia.");
            break;
            case "V": System.out.println("Boa tarde");
            break;
            case "N": System.out.println("Boa noite");
            break;
            default:
                System.out.println("Erro ao informar o turno");
                break;
        }
        sc.close();
    }
}
