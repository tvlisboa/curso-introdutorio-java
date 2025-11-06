package aula16;

public class UsoFor {
    public static void main(String[] args) {

        /**
         * Meu contador ira iniciar com 5
         * enquanto o contador for menor que 50
         * incrementa 5
         */

        for( int count = 5; count < 50; count+= 5){
            System.out.println("Iniciando a contagem...");
            System.out.println( "O valor do contador é :" + count );
        }

        /**
         * Contador inicia com 100
         * enquanto o contador for maior que 35
         * decrementa 3
         */

        for (int marc = 100; marc > 35; marc-= 3){
            System.out.println("Reiniciando a contagem...");
            System.out.println("O valor do contador MARC é :" + marc);
        }

        for(int a=0, b=100; a<b; a++, b--){
            System.out.println("Reiniciando a contagem...");
            System.out.println(a);
            System.out.println(b);
        }
    }
}
