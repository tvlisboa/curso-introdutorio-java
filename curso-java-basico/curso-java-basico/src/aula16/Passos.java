package aula16;

public class Passos {
    public static void main(String[] args) {
        int caminhada = 0;
        int chegada = 100;

        System.out.println("Inicio da caminhada...");
        System.out.println(caminhada);

        do {
            caminhada+=2;
            System.out.println("Os passos atuais é: " + caminhada);
        }while(caminhada < chegada);
    }

}

