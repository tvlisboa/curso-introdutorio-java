package exercicios4;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        /**
         * Nos ultimos exercicios utilizando o
         * while ou do_while
         * reutlizamos as variaveis informacoes
         * fazendo assim uma flag
         */

        Scanner sc = new Scanner(System.in);

        /**
         * Declaramos as variaveis
         * a populacao da cidade a
         * a populacao da cidade b
         * e suas respectivas taxas
         */

        double popA = 80000;
        double popB = 200000;
        double taxaA;
        double taxaB;

        boolean informacoes = false;

        /**
         * Pede a informacao da populacao a e faz a validacao
         */

        do{
            System.out.println("Informe a populacao A: ");
            popA = sc.nextDouble();

            if(popA >0){
                informacoes = true;
            }else {
                informacoes = false;
                System.out.println("População A precisa ser maior que zero");
            }
        }while(!informacoes);

        informacoes = false;

        /**
         * Pede a informacao da populacao b e faz a validacao
         */

        do{
            System.out.println("Informe a populacao B: ");
            popB = sc.nextDouble();

            if(popB >0){
                informacoes = true;
            }else {
                informacoes = false;
                System.out.println("População B precisa ser maior que zero");
            }
        }while(!informacoes);

        informacoes = false;

        /**
         * Pede a informacao da taxa populacional A
         */

        do{
            System.out.println("Informe a taxa de crescimento da POPULACAO A: ");
            taxaA = sc.nextDouble();

            if(taxaA >0){
                informacoes = true;
            }else {
                informacoes = false;
                System.out.println("A taxa de crescimento precisa ser maior que zero");
            }
        }while(!informacoes);

        informacoes = false;

        /**
         * Pede a informacao da taxa populacional B
         */

        do{
            System.out.println("Informe a taxa de crescimento da POPULACAO B: ");
            taxaB = sc.nextDouble();

            if(taxaB >0){
                informacoes = true;
            }else {
                informacoes = false;
                System.out.println("A taxa de crescimento precisa ser maior que zero");
            }
        }while(!informacoes);

        int cont = 0;
        while(popA < popB){
            popA += (popA / 100) * taxaA;
            popB += (popB / 100) * taxaB;
            cont++;
        }

        System.out.println("Populacao A : " + popA);
        System.out.println("Populacao B : " + popB);
        System.out.println("Quantiade em anos : " + cont);
    }
}
