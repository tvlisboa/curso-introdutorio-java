package aula17;

import java.math.BigDecimal;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /**
         * Definir as variaveis globais
         * pois por boa pratica
         * facilita as implementacoes
         */

        String nomeUser;
        String senhaUser;
        boolean infoValida = false;

        do{
            System.out.println("Informe o nome do usuario.");
            nomeUser = sc.nextLine();

            System.out.println("Informe a senha do usuario.");
            senhaUser = sc.nextLine();

            if(nomeUser.equalsIgnoreCase(senhaUser)){
                infoValida = false;
                System.out.println("Senha invalida, nao pode ser igual nome do usuario");
            }else {
                infoValida = true;
                System.out.println("Senha e usuario validos");
            }
        }while(!infoValida);
    }
}
