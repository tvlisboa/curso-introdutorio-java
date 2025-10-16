package aula15;

import java.util.Scanner;

public class Exercicio4_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe uma letra a seguir: ");
        String input = sc.next();

        if(input.length()>1){
            System.out.println("Caracter invalido");
        } else {
            if(input.equalsIgnoreCase("A")
                    || input.equalsIgnoreCase("E")
                    || input.equalsIgnoreCase("I")
                    || input.equalsIgnoreCase("O")
                    || input.equalsIgnoreCase("U")){
                System.out.println("É uma vogal.");
            }else {
                System.out.println("É uma consoante.");
            }
        }
    }
}
