package aula16;

public class Do_While_1 {
    public static void main(String[] args) {
        int inicio = 1;
        int fim = 15;

        System.out.println("Iniciando a contagem: " + inicio);

        do {
            inicio+=2;
            System.out.println("Contagem[...]" + inicio);
        }while(inicio < fim);
        System.out.println(inicio);
    }
}
