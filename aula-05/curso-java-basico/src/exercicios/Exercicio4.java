package exercicios;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma letra");
        String letra = sc.next();

        if(letra.equalsIgnoreCase("A")
                || letra.equalsIgnoreCase("e")
                || letra.equalsIgnoreCase("i")
                || letra.equalsIgnoreCase("o")
                || letra.equalsIgnoreCase("u")){
            System.out.println("É uma vogal");
        }else {
            System.out.println("É uma consoante");
        }
        sc.close();
    }
}
