package aula15;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("###############");
        System.out.println("Calendario semanal");
        System.out.println("Informacoes de uso: ");
        System.out.println("Dias uteis");
        System.out.println("2 - Segunda || 3 - Terca || 4 - Quarta" +
                " || 5 - Quinta || 6 - Sexta");
        System.out.println("###############");
        System.out.println("Fins de semana");
        System.out.println("7 - Sabado || 8 - Domingo");
        System.out.println("###############");
        System.out.println("Digite a opção a seguir: ");
        int dia = sc.nextInt();

        switch (dia) {
            case 2:
                System.out.println("O dia informado é: ");
                System.out.println("Dia de semana.");
                System.out.println("Segunda - Feira");
                break;
            case 3:
                System.out.println("O dia informado é: ");
                System.out.println("Dia de semana.");
                System.out.println("Terca - Feira");
                break;
            case 4:
                System.out.println("O dia informado é: ");
                System.out.println("Dia de semana.");
                System.out.println("Quinta - Feira");
                break;
            case 5:
                System.out.println("O dia informado é: ");
                System.out.println("Dia de semana.");
                System.out.println("Quinta - Feira");
                break;
            case 6:
                System.out.println("O dia informado é: ");
                System.out.println("Dia de semana.");
                System.out.println("Sexta - Feira");
                break;
            case 7:
                System.out.println("O dia informado é: ");
                System.out.println("Final de semana.");
                System.out.println("Sabado");
                break;
            case 8:
                System.out.println("O dia informado é: ");
                System.out.println("Final de semana.");
                System.out.println("Domingo");
                break;
                default:
                    System.out.println("Opcao informada é invalida");
        }
        sc.close();
    }
}
