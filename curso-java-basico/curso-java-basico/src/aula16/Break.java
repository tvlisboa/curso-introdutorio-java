package aula16;

public class Break {
    public static void main(String[] args) {

        int num = 100;

        for (int i = 0; i < num; i++) {
            if (i * i >= num) {
                break;
            }
            System.out.println("O valor do num atualmente é: " + num);
        }
    }
}