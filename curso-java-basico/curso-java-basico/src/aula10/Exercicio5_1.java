package aula10;

import java.util.Scanner;

public class Exercicio5_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a medida em MTS a seguir");
        double medida = sc.nextDouble();

        double centimetros = medida * 100;

        System.out.print("A medida informada em MTS foi: ");
        System.out.println(medida);

        System.out.print("Convertendo a media informada para CM: ");
        System.out.println(centimetros);

    }
}
