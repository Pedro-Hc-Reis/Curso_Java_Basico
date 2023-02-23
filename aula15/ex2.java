package aula15;

import java.util.Scanner;

public class ex2 {
  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);

    System.out.println("Digite um número: ");
    double valor = scan.nextInt();
    
    if(valor>=0){
      System.out.println("O número " + valor + " é positivo.");
    }else{
      System.out.println("O número " + valor + " é negativo.");
    }
  }

}
