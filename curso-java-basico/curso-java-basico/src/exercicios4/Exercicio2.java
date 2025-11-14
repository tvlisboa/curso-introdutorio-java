package exercicios4;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean infoValidas = false;
        String userName;
        String passkey;

        do{
            System.out.print("Insira o username");
            userName = sc.nextLine();

            System.out.print("Insira o password");
            passkey = sc.nextLine();

            if(userName.equalsIgnoreCase(passkey)){
                infoValidas = false;
                System.out.println("Informacoes invalida");
                System.out.print("Password nao pode ser igual ao username");
            }else{
                infoValidas = true;
                System.out.println("Informacoes valida");
                infoValidas = true;
            }
        }while(!infoValidas);
    }
}
