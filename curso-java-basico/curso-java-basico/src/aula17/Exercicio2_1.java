package aula17;

import java.util.Scanner;

public class Exercicio2_1 {
    public static void main(String[] args) {

        /**
         * Para a utilização de loops
         * o ideal e declarar as variaveis em
         * escopo global
         * para quando utilizar em escopos nao
         * fazer as novas instancias de variaveis
         */

        Scanner sc = new Scanner(System.in);

        String nomeUsuario;
        String senhaUsuario;
        boolean infoValida = false;

        do{
            System.out.println("Digite nome do usuario: ");
            nomeUsuario = sc.nextLine();

            System.out.println("Digite a senha do usuario: ");
            senhaUsuario = sc.nextLine();

            if(nomeUsuario.equalsIgnoreCase(senhaUsuario)){
                infoValida = false;
                System.out.println("A senha ou nome do usuario é invalida");
            }else {
                infoValida = true;
                System.out.println("Usuario permitido");
            }

            //faz o bloco ate a informacao ser valida = true
        }while (!infoValida);
        sc.close();
    }
}
