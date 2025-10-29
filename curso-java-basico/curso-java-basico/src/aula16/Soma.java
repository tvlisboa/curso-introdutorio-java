package aula16;

public class Soma {
    public static void main(String[] args) {
        int soma = 0;

        for (int i = 0; i < 5; soma= i++) {
            System.out.println("o valor atual da soma é: ");
            System.out.println(soma);
        }

        for(int i = 25; i >= 5; soma= i--){
            System.out.println("O valor atual da soma é: ");
            System.out.println(soma);
        }
    }
}
