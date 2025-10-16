package aula14;

import java.util.Scanner;

public class SwitchCase4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma opcao a seguir");
        System.out.println("Opcao 1: ");
        System.out.println("Moveis para quarto");
        System.out.println(" ");

        System.out.println("Opcao 2: ");
        System.out.println("Moveis para sala");
        System.out.println(" ");

        System.out.println("Opcao 3: ");
        System.out.println("Moveis para cozinha");
        System.out.println(" ");


        System.out.println("Opcao 4: ");
        System.out.println("Decoração");
        System.out.println(" ");

        System.out.println("Opcao 5: ");
        System.out.println("Itens de escritório");
        System.out.println(" ");

        int opcao = sc.nextInt();

        switch (opcao) {
            case 1: System.out.println("Moveis para quarto");
            break;
            case 2: System.out.println("Moveis para sala");
            break;
            case 3: System.out.println("Moveis para cozinha");
            break;
            case 4: System.out.println("Itens de decoração");
            break;
            case 5: System.out.println("Itens de escritorio");
            break;
            default: System.out.println("Opcao digitada é invalida");
            break;
        }
        sc.close();
    }
}
