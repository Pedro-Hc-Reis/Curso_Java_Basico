package aula24.Exercicios;

import aula24.LivroLivraria;

public class ex3 {

    public static  void main(String[] args){

        LivroLivraria livrolivraria = new LivroLivraria();

        livrolivraria.nome = "Arquivo X";
        livrolivraria.autor = "XXXX";
        livrolivraria.anoLancamento = 2015;
        livrolivraria.preco = 60;

        System.out.println("Nome do livro = " + livrolivraria.nome);
    }
}
