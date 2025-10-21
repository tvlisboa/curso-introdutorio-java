package aula14;

import java.util.Scanner;

public class SwitchCase3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o dia da semana: ");
        int diaSemana = sc.nextInt();

        switch (diaSemana){
            case 2: System.out.println("Segunda-Feira");
            case 3: System.out.println("Terça-Feira");
            case 4: System.out.println("Quarta-Feira");
            case 5: System.out.println("Quinta-Feira");
            case 6: System.out.println("Sexta-Feira");
                System.out.println("Os dias informados são dias úteis:");
                break;
            case 7: System.out.println("Sábado");
            case 1: System.out.println("Domingo");
                System.out.println("Dias informados são dias de fim de semana: ");
                break;
            default: System.out.println("Dia informado é invalido");
        }
        sc.close();
    }
}
