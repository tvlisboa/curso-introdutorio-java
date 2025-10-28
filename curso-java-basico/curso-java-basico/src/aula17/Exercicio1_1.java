package aula17;

import java.util.Scanner;

public class Exercicio1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean repetir = true;

        do{
            System.out.println("Digite a nota: ");
            double nota = sc.nextDouble();

            if(nota >= 0 && nota <= 10){
                repetir = false;
                System.out.println("A nota informada é valida");
                System.out.println(nota);
            }else{
                repetir = true;
                System.out.println("A nota informada é invalida");
                System.out.println(nota);
            }

        }while(repetir);

        sc.close();
    }
}
