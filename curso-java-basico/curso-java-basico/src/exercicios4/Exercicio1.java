package exercicios4;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        /**
         * Solicita o usuario para informar uma nota
         * usamos o looping do_while para
         * verificar se a nota informada esta entre 0 e 10
         * estando ele sai do looping utilzando a comparaca !notavalida
         * Fara o looping enquanto a nota noa e valida.
         */

        Scanner sc = new Scanner(System.in);
        boolean notaValida = false;

        do{
            System.out.println("Insira uma nota.");
            double nota1 = sc.nextDouble();

            if(nota1 >= 0 && nota1 <= 10){
                notaValida = true;
                System.out.println("A nota informada é: ");
                System.out.println("Nota 1: " + nota1);
                System.out.println("Nota valida");
            }else {
                notaValida = false;
                System.out.println("A nota informada pe invalida");
            }
        }while(!notaValida);
    }
}
