package exercicios2;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o nome do funcionário a seguir: ");
        String nomeFunc = sc.nextLine();

        System.out.println("Setor do funcionárioa: ");
        String nomeSetor = sc.nextLine();

        System.out.println("Informe quantidade de horas trabalhadas diariamente: ");
        double horasDia = sc.nextDouble();

        System.out.println("Informe quantidade de dias trabalhados: ");
        int diasTrab = sc.nextInt();

        System.out.println("Quantidade de semana trabalhada: ");
        int semanaTrab = sc.nextInt();

        System.out.println("Valor hora trabalhada: ");
        double horaTrab = sc.nextDouble();

        double calcMensal = horasDia * horaTrab * diasTrab * semanaTrab;

        System.out.println("O funcionário :" + nomeFunc);
        System.out.println("Setor: " + nomeSetor);
        System.out.print("Recebe o valor de: $$");
        System.out.println(calcMensal);
        sc.close();
    }
}
