package aula43;

public class Teste {

    public static void main(String[] args){

        Aluno aluno = new Aluno();

        aluno.setCurso("Ciências da Computação");
        double[] notas = {10, 9, 8, 7};
        aluno.setNotas(notas);

        System.out.println(aluno);

        String s1 = "xxxxxxx";
        String s2 = "xxxxxxx";

        System.out.println(s1.equalsIgnoreCase(s2));

        Aluno aluno2 = new Aluno();

        aluno.setCurso("Ciências da Computação");
        double[] notas2 = {6, 9, 8, 7};
        aluno.setNotas(notas2);

        System.out.println(aluno.equals(aluno2));
    }
}
