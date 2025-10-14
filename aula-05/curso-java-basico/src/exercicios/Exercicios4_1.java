package exercicios;

import java.util.Scanner;

/**
 * Utilizando o switch-case
 */

public class Exercicios4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma letra.");
        String letra = sc.next().toUpperCase();

        if(letra.length() > 1){
            System.out.println("Nao é um metodo valido");
        }else {
            switch (letra) {
                case "A":
                case "E":
                case "I":
                case "O":
                case "U":
                    System.out.println("É uma vogal");
                    break;
                default:
                    System.out.println("É uma consoante");
            }
        }
        sc.close();
    }
}
