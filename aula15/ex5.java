package aula15;

import java.util.Scanner;

public class ex5 {
  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);

    System.out.println("Digite a primeira nota:");
    Double nota1 = scan.nextDouble();

    System.out.println("Digite a segunda nota:");
    Double nota2 = scan.nextDouble();

    Double media = (nota1 + nota2) / 2;

    if(media == 10){
      System.out.println("Sua média é " + media + ". Aprovado com Distinção.");
    } else if(media >= 7){
      System.out.println("Sua média é " + media + ". Aprovado.");
    }else{
      System.out.println("Sua média é " + media + ". Reprovado.");
    }
  }
  
}
