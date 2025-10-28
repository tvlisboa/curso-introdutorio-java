package aula17;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean valido = false;
        double popa = 80000;
        double popb = 200000;
        double taxaA;
        double taxaB;
        int cont = 0;

        while(popa < popb){
            popa += (popa / 100) * 3;
            popb += (popb / 100) * 1.5;
            cont++;
        }
        System.out.println("A população a terá a quantidade de moradores: " +popa);
        System.out.println("A população a terá b quantidade de moradores: " +popb);
        System.out.println("A população a sera maior que a b em anos: " + cont);

    }
}
