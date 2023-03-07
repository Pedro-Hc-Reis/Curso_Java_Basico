package aula33.Exercicios;

import java.util.Scanner;

public class ex3 {

    public  static void  main(String[]args){

        Scanner scan = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Entre com o nome do aluno");
        aluno.setNome(scan.next());

        System.out.println("Entre com o nome do curso");
        aluno.setCurso(scan.next());

        for(int i = 0 ; i < aluno.getDisciplinas().length ; i++){
            System.out.println("Entre com o nome da disciplina " + i);
            aluno.setNomeDisciplinaPos(i, scan.next());
        }

        for(int i = 0 ; i < aluno.getNotas().length ; i++){
            System.out.println("Obtendo notas da disciplina " + aluno.getDisciplinas()[i]);
            for (int j = 0 ; j < aluno.getNotas()[i].length ; j++){
                System.out.println("Entre com a nota " + (j + 1));
                aluno.setNomePosIJ(i, j, scan.nextDouble());
            }
        }

        aluno.mostrarInfo();

        for(int i = 0 ; i < aluno.getDisciplinas().length ; i++){
            if(aluno.verficarAprovado(i)){
                System.out.println("Disciplina " + aluno.getDisciplinas()[i] + " - foi aprovado");
            } else {
                System.out.println("Disciplina " + aluno.getDisciplinas()[i] + " - reprovado");
            }
        }
    }
}