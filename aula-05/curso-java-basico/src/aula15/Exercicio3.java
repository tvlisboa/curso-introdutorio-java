package aula15;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha as opcoes abaixo");
        System.out.println("F - FEM");
        System.out.println("M - MASC");
        String opcao = sc.nextLine().toUpperCase();

        switch (opcao){
            case "F":
                System.out.println("A opcao escolhida é: ");
                System.out.println("F - FEM");
            break;
            case "M":
                System.out.println("A opcao escolhida é: ");
                System.out.println("M - MASC");
            break;
            default: System.out.println("Opcao digitada é invalida.");
            break;
        }
        sc.close();
    }
}
