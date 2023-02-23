package aula15;

import java.util.Scanner;

public class ex4 {

  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);

    System.out.println("Digite uma letra: ");
    String letra = scan.next();

    if(letra.length() > 1){

      System.out.println("Não é uma letra valida");
    } else{

      if(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")){
        System.out.println("A letra digitada é uma vogau");
      }else{
        System.out.println("A letra é uma consoante");
      }
    }
  }
  
}
