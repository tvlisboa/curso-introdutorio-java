package aula10;

import java.util.Scanner;

public class Exercicio6_1 {
    public static void main(String[] args) {

        /**
         * Peca o raio do circulo
         * calcular e mostrar
         * a area do ciculo
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o raio do circulo a seguir :");
        double raio = sc.nextDouble();

        double areacirculo = Math.PI * Math.pow(raio, 2);

        System.out.println("A area do circulo informado foi: ");
        System.out.println(areacirculo);
    }
}
