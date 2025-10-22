package aula16;

public class DoWhile {
    public static void main(String[] args) {
        int i = 1;
        int max = 10;

        System.out.print("Contador até o :" + max);

        do{
            i++;
            System.out.println("O valor de i é: " + i);
        }while(i < max);
    }

}
