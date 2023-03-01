package aula24.Exercicios;

import aula24.LivroDeBiblioteca;

import java.util.Date;

public class ex4 {

    public static  void main(String[] args){

        LivroDeBiblioteca livrobiblioteca = new LivroDeBiblioteca();

        livrobiblioteca.nome = "Arquivo X";
        livrobiblioteca.autor = "XXXX";
        livrobiblioteca.anoLancamento = 2015;

        livrobiblioteca.emprestado = true;
        livrobiblioteca.dataEntrega = new Date();
        livrobiblioteca.emprestadoA = "Pedro";

        System.out.println("Nome do livro = " + livrobiblioteca.nome);
    }
}
