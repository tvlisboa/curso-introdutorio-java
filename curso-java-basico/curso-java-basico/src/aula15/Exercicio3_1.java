package aula15;

import java.util.Scanner;

public class Exercicio3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe uma letra a seguir");
        System.out.println("F - FEM");
        System.out.println("M - MASC");
        String input = sc.nextLine();

        if(input.length() > 1){
            System.out.println("Caractere Invalido");
        }else {
            if(input.equalsIgnoreCase("F")){
                System.out.println("F - FEM");
            } else if (input.equalsIgnoreCase("M")) {
                System.out.println("M - MASC");
            } else {
                System.out.println("A Opcao informada e invalida");
            }
        }
        sc.close();
    }
}
