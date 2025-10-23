package aula16;

public class Contador {
    public static void main(String[] args) {

        int inicio = 1;
        int maximo = 10;

        System.out.println("Inicio da contagem : " + inicio);

        while(inicio < maximo){
            System.out.println("o valor do contador é : " + inicio);
            inicio++;
        }
        System.out.println(inicio);
    }
}
