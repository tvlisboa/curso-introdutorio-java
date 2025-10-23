package aula16;

public class For {
    public static void main(String[] args) {

        for (int i = 5; i < 10; i++){
            System.out.println(i);
        }
        for (int i = 10; i > 5; i--){
            System.out.println(i);
        }
        System.out.println("Fim do loop for");
        System.out.println("$$$$$$$$$$$$$$$$$$$$");

        for(int i = 0, j = 10 ; i < j; i ++, j --){
            System.out.println("O valor de I na aplicacao é : " + i +
                    " E o valor de J na aplicacao é : " + j);
        }
        System.out.println("Fim do loop for");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$");

        int count = 3;
        for(; count < 27;){
            System.out.println("A posicao do count é : " + count);
            count+=3;
        }
        System.out.println("Fim do loop for");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$");


        for(int count2 =4; count2 <= 24; count2+=4){
            System.out.println("A posicao do I é: " + count2);
        }
        System.out.println("Fim do loop for");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$");


        int soma = 5;
        for(int i = 1; i < 15; soma += i++);
        System.out.println("o VALOR da soma é : " + soma);
        System.out.println("Fim do loop for");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }
}
