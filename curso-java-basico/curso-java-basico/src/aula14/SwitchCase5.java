package aula14;

import java.util.Scanner;

public class SwitchCase5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o dia da semana a seguir.");
        int dia = sc.nextInt();

        switch (dia) {
            case 2:
                System.out.println("O dia informado a seguir é: ");
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("O dia informado a seguir é: ");
                System.out.println("Terca-Feira");
                break;
            case 4:
                System.out.println("O dia informado a seguir é: ");
                System.out.println("Quarta-Feira");
                break;
            case 5:
                System.out.println("O dia informado a seguir é: ");
                System.out.println("Quinta-Feira");
                break;
            case 6:
                System.out.println("O dia informado a seguir é: ");
                System.out.println("Sexta-Feira");
                break;
            case 7:
                System.out.println("O dia informado a seguir é: ");
                System.out.println("Sabado");
                break;
            case 8:
                System.out.println("O dia informado a seguir é: ");
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Dia informado é invalido");
                break;
        }
    }
}
