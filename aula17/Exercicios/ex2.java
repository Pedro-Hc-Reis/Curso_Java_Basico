package aula17;

import java.util.Scanner;

public class ex2 {
  
  public  static void main (String[] args){

    Scanner scan = new Scanner(System.in);
    String nome;
    String senha;
    boolean senhaValida = false;

    do {
      System.out.println("Informe seu nome:");
      nome = scan.next();
      System.out.println("Informe sua senha: (Obs: Sua senha não pode ser igual ao nome)");
      senha = scan.next();
      if(senha.equalsIgnoreCase(nome)){
        System.out.println("Senha inválida, a senha está identica ao nome");
      } else{
        System.out.println("Nome: " + nome + " e senha: " + senha);
        senhaValida = true;
      }

    } while(!senhaValida);
  }
}
