package aula15;

import java.util.Scanner;

public class ex3 {
  
  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);

    System.out.println("Digite um seu sexo: M - Masculino | F - Feminino ");
    String sexo = scan.next();
    
    if(sexo.equalsIgnoreCase("m")){
      System.out.println("Seu sexo é Masculino");
    }else if(sexo.equalsIgnoreCase("f")){
      System.out.println("Seu sexo é Feminino");
    }else{
      System.out.println("Sexo Inválido");
    }
  }
}
