package aula16;

public class ExemploFor {
    public static void main(String[] args) {

        /**
         * Dentro do bloco do FOR
         * Ja declaramos a variavel de inicio
         * Determinamos a condicao de parada
         * E fazemos o incremento ou decremento
         */

        for(int i = 0; i <= 10; i++){
            System.out.println("O valor de i atualmente é: " +i);
        }

        for(int j = 10; j >= 5; j--){
            System.out.println("O valor de J atualmente é: " +j);
        }

        for(int k = 100; k != 10; k-=2){
            System.out.println(k);
        }

        for(int t = 0, v = 10 ; t < v ; t++, v-- ){
            System.out.println("O valor atual de V: " + v);
            System.out.println("O valor atual de T: " + t);
        }

        int valor = 0;
        for(; valor <= 20;){
            System.out.println("O valor de inicio atual de Valor: " + valor);
            valor+=2;
        }
        System.out.println(valor);

        for(int soma = 0; soma <=20; soma+=2){
            System.out.println("O valor de soma atual de Valor: " + soma);
        }

        int soma = 0;
        for(int i = 0; i <= 10; soma+=i++){
            System.out.println("O valor de soma atual de Valor: " + soma);
            System.out.println("Trabalhando com blocos, sempre utilize o escopo com" +
                    "chaves");
        }
    }
}
