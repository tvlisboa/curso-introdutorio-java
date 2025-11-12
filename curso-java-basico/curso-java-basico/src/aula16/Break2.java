package aula16;

import java.util.Scanner;

public class Break2 {
    public static void main(String[] args) {

        /**
         * Solicitou dois numeros ao usuario
         * fizemos um for para varrer os numeros e compara-los se sao menores
         * se o numero informado for divisivel pelo que foi informado
         * ele sai do loop
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um valor inicial a seguir:");
        double numero1 = sc.nextDouble();

        System.out.println("Insira um valor final a seguir:");
        double numero2 = sc.nextDouble();

        for(double i = numero1; i <= numero2; i++){
        if(i % 9 == 0){
            System.out.println("Primeiro numero divisivel é: ");
            System.out.println(i);
            break;
            }
        }
    }
}
