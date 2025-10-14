package exercicios;

import java.util.Scanner;

public class Exercicio3_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o sexo do usuario.");
        System.out.println("F - FEM");
        System.out.println("M - MASC");
        String sexo = sc.next();

        if(sexo.equalsIgnoreCase("f")){
            System.out.println("FEMININO");
        } else if (sexo.equalsIgnoreCase("m")) {
            System.out.println("MASCULINO");
        }else{
            System.out.println("O sexo informado é invalido");
        }
        sc.close();
    }
}
