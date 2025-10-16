package aula15;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a letra a seguir");
        String letra = sc.nextLine().toUpperCase();

        if(letra.length() > 1){
            System.out.println("Nao é um caracter valido");
        }else{
            switch (letra) {
                case "A":
                case "E":
                case "I":
                case "O":
                case "U":
                    System.out.println("A letra informada é uma vogal: " + letra);
                    break;
                default:
                    System.out.println(letra);
                    System.out.println("A letra informada é uma consoante: " + letra);
                    break;
            }
        }
        sc.close();
    }
}
