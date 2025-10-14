package exercicios;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o sexo do usuario a seguir:");
        System.out.println("F - FEMININO");
        System.out.println("M - MASCULINO");

        String sexo = sc.next().toUpperCase();

        switch (sexo) {
            case "F":
                System.out.println("O sexo informado foi: ");
                System.out.println("FEMININO");
            break;
            case "M":
                System.out.println("O sexo informado foi: ");
                System.out.println("MASCULINO");
            break;
            default: System.out.println("Sexo invalido");
            break;
        }
        sc.close();
    }
}
