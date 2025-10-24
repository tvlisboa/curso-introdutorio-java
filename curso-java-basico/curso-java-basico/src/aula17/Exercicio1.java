package aula17;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean notaValida = true;

        do {
            System.out.println("Digite uma nota entre 0 e 10");
            double nota = sc.nextDouble();

            if (nota > 0 && nota <= 10) {
                notaValida = true;
                System.out.println("Nota informada é valida");
                System.out.println("Nota digitadao : " + nota);

            }else {
                System.out.println("Nota informada é invalida");
                System.out.println("Digite novamente");
            }

        }while(!notaValida);
        sc.close();
    }
}
