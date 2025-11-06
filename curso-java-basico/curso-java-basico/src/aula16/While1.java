package aula16;

public class While1 {
    public static void main(String[] args) {

        int inicio = 0;
        int max = 10;

        System.out.println("Contagem ate o maximo: " + max);

        while (inicio < max) {
            System.out.println("Contagem inicada");
            System.out.println(inicio++);
        }
    }
}
