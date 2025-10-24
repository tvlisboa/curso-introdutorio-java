package aula17;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nomeUser;
        int idadeUser;
        double salUser;
        String sexoUser;
        String estadoCivil;

        boolean infoValida = false;

        do {

            System.out.println("Digite seu nome");
            nomeUser = sc.nextLine();

            if (nomeUser.length() > 3) {
                infoValida = true;
                System.out.println("Nome do usuario é valido");
            } else {
                infoValida = false;
                System.out.println("Nome do usuario nao e valido");
            }

        } while (!infoValida);

        infoValida = false;

        do {
            System.out.println("Digite sua idade");
            idadeUser = sc.nextInt();

            if (idadeUser > 0 && idadeUser <= 90) {
                infoValida = true;
            } else {
                System.out.println("Idade informada é invalida.");
            }

        } while (!infoValida);

        infoValida = false;

        do {

            System.out.println("Informe o salario do usuario");
            salUser = sc.nextDouble();

            if (salUser > 0) {
                infoValida = true;
            } else {
                System.out.println("O Salario informado é invalido.");
                System.out.println("O salario precisa ser maior do que ZERO");
            }

        } while (!infoValida);

        infoValida = false;

        do {
            System.out.println("Informe o sexo do usuario");
            sexoUser = sc.next().toUpperCase();

            if (sexoUser == "F" || sexoUser == "M") {
                infoValida = true;
            } else {
                System.out.println("Sexo informado é invalido.");

            }
        }while (!infoValida) ;

            infoValida = false;

            do {
                System.out.println("Informe o estado-civil do usuario");
                estadoCivil = sc.next().toUpperCase();

                if (estadoCivil.length() > 1) {
                    if (estadoCivil == "F" || estadoCivil == "M") {
                        infoValida = true;
                    } else {
                        System.out.println("Estado-civil informado é invalido");
                    }
                } else {
                    System.out.println("Caractere invalido");
                }

        } while (!infoValida);

    }
}