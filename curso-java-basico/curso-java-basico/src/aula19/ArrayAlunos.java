package aula19;

public class ArrayAlunos {
    public static void main(String[] args) {

        String[] alunos = new String[8];

        alunos[0] = "Maria";
        alunos[1] = "Estevao";
        alunos[2] = "Marcos";
        alunos[3] = "Alexandre";
        alunos[4] = "Jessica";
        alunos[5] = "Tales";
        alunos[6] = "Roberto";
        alunos[7] = "Olga";


        System.out.println("O tamanho do array informado é: " + alunos.length);
        System.out.println("Aluno na posicao: " + alunos[2]);
        System.out.println("Aluno na posicao: " + alunos[4]);
        System.out.println("Aluno na posicao: " + alunos[7]);

        for(int count = 0; count < alunos.length; count++){
            System.out.println("Nome dos alunos na posicao: " + (count + 1) + ", " + alunos[count]);
        }
    }
}
