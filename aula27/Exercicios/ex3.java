package aula27.Exercicios;

import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.print("Digite o nome do aluno: ");
        aluno.nome = scanner.nextLine();

        System.out.print("Digite a matrícula do aluno: ");
        aluno.matricula = scanner.nextLine();

        System.out.print("Digite o curso do aluno: ");
        aluno.curso = scanner.nextLine();

        for (int i = 0 ; i < aluno.disciplinas.length ; i++) {
            System.out.print("Digite o nome da disciplina " + i + ": ");
            aluno.disciplinas[i] = scanner.nextLine();
        }

        for(int i = 0 ; i < aluno.notas.length ; i++){
            System.out.println("Obtendo nota da disciplina " + aluno.disciplinas[i]);
            for (int j = 0 ; j < aluno.notas[i].length ; j++){
                System.out.println("Digite a nota " + (j+1)+ ": ");
                aluno.notas[i][j] = scanner.nextDouble();
            }
        }

        aluno.mostrarInfo();

        for (int i=0 ; i < aluno.disciplinas.length ; i++){
            if(aluno.verificarAprovado(i)){
                System.out.println("Disciplina " + aluno.disciplinas[i] + " - foi aprovado");
            } else{
                System.out.println("Disciplina " + aluno.disciplinas[i] + " - reprovado");
            }
        }
    }
}
