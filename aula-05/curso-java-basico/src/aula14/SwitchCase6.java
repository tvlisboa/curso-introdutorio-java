package aula14;

import java.util.Scanner;

public class SwitchCase6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma opcao a seguir");
        int option = sc.nextInt();

        switch (option) {
            case 2:
                System.out.println("O dia informado é: ");
                System.out.println("Segunda - Feira");
                System.out.println("Dia útil");
            case 3:
                System.out.println("O dia informado é: ");
                System.out.println("Terca - Feira");
                System.out.println("Dia útil");
            case 4:
                System.out.println("O dia informado é: ");
                System.out.println("Quarta - Feira");
                System.out.println("Dia útil");
            case 5:
                System.out.println("O dia informado é: ");
                System.out.println("Quinta - Feira");
                System.out.println("Dia útil");
            case 6:
                System.out.println("O dia informado é: ");
                System.out.println("Sexta - Feira");
                System.out.println("Dia útil");
                break;
            case 7:
                System.out.println("O dia informado é: ");
                System.out.println("Sabado");
                System.out.println("Fim de semana");
            case 8:
                System.out.println("O dia informado é: ");
                System.out.println("Domingo");
                System.out.println("Fim de semana");
                break;
            default:
                System.out.println("Opcao informada é invalida");
        }
    }
}
