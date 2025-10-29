package aula16;

public class PassosWhile {
    public static void main(String[] args) {

        int inicio = 0;
        int chegada = 100;

        System.out.println("Vamos caminhar até : " + chegada);
        System.out.println("Iniciando a caminhada.");

        while (inicio < chegada) {
            System.out.println("Caminhando : " + inicio);
            inicio+=2;
        }
        System.out.println("Chegamos ao destino");
        System.out.println(inicio);
    }
}
