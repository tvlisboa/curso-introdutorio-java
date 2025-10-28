package aula17;

import java.util.Scanner;

public class Exercicio1_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean notaValida = false;

        do{
            System.out.println("Digite uma nota: ");
            double nota1 = sc.nextDouble();

            if(nota1 >=0 && nota1 <=10){
                notaValida = true;
                System.out.println("A nota informada é valida: " + nota1);
            }else {
                notaValida = false;
                System.out.println("A nota informada não é valida: " + nota1);
                System.out.println("Digite novamente: ");
            }
        }while(!notaValida);
        sc.close();
    }
}
