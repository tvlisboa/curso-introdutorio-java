package aula19;

public class IntroducaoArray {
    public static void main(String[] args) {

        double[] notasAlunos = new double[10];
        notasAlunos[0] = 9.1;
        notasAlunos[1] = 8.5;
        notasAlunos[2] = 6.0;
        notasAlunos[3] = 5.5;
        notasAlunos[4] = 10.0;
        notasAlunos[5] = 10.0;
        notasAlunos[6] = 4.75;
        notasAlunos[7] = 7.25;
        notasAlunos[8] = 6.9;
        notasAlunos[9] = 8.5;

        System.out.println("Notas alunos: " + notasAlunos[2]);
        System.out.println("O tamanho do ARRAY atual: " + notasAlunos.length);

        for(double i = 0; i < notasAlunos.length; i++){
            System.out.println("As notas dos alunos na posicao " + (i + 1) + " É " + notasAlunos[(int) i]);
        }

        for(double nota : notasAlunos){
            System.out.println(nota);
        }
    }
}
