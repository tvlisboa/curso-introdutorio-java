package aula17;

import java.util.Scanner;

public class Exercicio1_while {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean notaValida = true;
        double nota1 = 0;


        while (notaValida) {
            System.out.println("Digite a nota: ");
            nota1 = sc.nextDouble();

            if(nota1 > 0 && nota1 <= 10) {
                System.out.println("Nota 1: " + nota1);
                System.out.println("A nota informado é valida");
            }else {
                System.out.println("A nota informada é invalida");
            }
        }
    }
}
