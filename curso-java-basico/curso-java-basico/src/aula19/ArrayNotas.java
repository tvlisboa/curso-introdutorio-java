package aula19;

public class ArrayNotas {
    public static void main(String[] args) {

        /**
         * 5 Alunos
         * 4 Notas
         */

        Double[][] notasAlunos = new Double[5][4];

        notasAlunos[0][0] = 5.0;
        notasAlunos[0][1] = 8.45;
        notasAlunos[0][2] = 7.0;
        notasAlunos[0][3] = 6.5;

        notasAlunos[1][0] = 9.0;
        notasAlunos[1][1] = 4.0;
        notasAlunos[1][2] = 4.25;
        notasAlunos[1][3] = 8.0;

        notasAlunos[2][0] = 6.5;
        notasAlunos[2][1] = 9.0;
        notasAlunos[2][2] = 4.0;
        notasAlunos[2][3] = 4.0;

        notasAlunos[3][0] = 8.0;
        notasAlunos[3][1] = 9.0;
        notasAlunos[3][2] = 9.0;
        notasAlunos[3][3] = 7.0;

        notasAlunos[4][0] = 8.0;
        notasAlunos[4][1] = 9.0;
        notasAlunos[4][2] = 9.0;
        notasAlunos[4][3] = 6.0;

        for(int i = 0 ; i < notasAlunos.length ; i++){
            for(int j = 0 ; j < notasAlunos[i].length ; j++){
                System.out.print("Nota : ");
                System.out.println(notasAlunos[i][j]);
            }
            System.out.println(" ");
        }
    }
}
