package aula15;

import java.util.Scanner;

public class ex10 {

  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);

    System.out.println("Digite o turno que você estuda: M - Matutino | V - Vespertino | N - Noturno ");
    String turno = scan.next();
    
    if(turno.equalsIgnoreCase("m")){
      System.out.println("Bom dia!");
    }else if(turno.equalsIgnoreCase("v")){
      System.out.println("Boa tarde!");
    }else if(turno.equalsIgnoreCase("n")){
      System.out.println("Boa noite!");
    }else{
      System.out.println("Valor Inválido");
    }
  }
}
