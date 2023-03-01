package aula24.Exercicios;

import aula24.Livro;

public class ex2 {

    public static  void main(String[] args){

        Livro livro = new Livro();

        livro.nome = "Arquivo X";
        livro.autor = "XXXX";
        livro.anoLancamento = 2015;

        System.out.println("Nome do livro = " + livro.nome);
    }
}
