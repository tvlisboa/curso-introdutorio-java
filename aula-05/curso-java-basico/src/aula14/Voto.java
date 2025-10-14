package aula14;

import java.util.Scanner;

public class Voto {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a idade a seguir");
        int idade = sc.nextInt();

        if(idade < 16){
            System.out.println("Adolescente.");
            System.out.println("Não pode votar.");

        } else if (idade >= 16 && idade < 21) {
            System.out.println("Maior de idade");
            System.out.println("Voto Opcional.");

        }else if (idade >= 21 && idade < 65){
            System.out.println("Adulto");
            System.out.println("Voto Obrigatório");

        }else if (idade  >= 65){
            System.out.println("Idoso");
            System.out.println("Voto facultativo");
        }
    }
}
