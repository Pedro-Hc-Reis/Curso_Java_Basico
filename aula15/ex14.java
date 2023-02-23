package aula15;

import java.util.Scanner;

public class ex14 {
  
  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);

    System.out.println("Digite a primeira nota:");
    Double nota1 = scan.nextDouble();

    System.out.println("Digite a segunda nota:");
    Double nota2 = scan.nextDouble();

    Double media = (nota1 + nota2) / 2;

    String aproveitamento = "";

    if(media <= 10 && media >= 9){
      aproveitamento = "A";
    } else if(media >= 7.5 && media < 9){
      aproveitamento = "B";
    } else if(media >=6  && media < 7.5){
      aproveitamento = "C";
    } else if(media >= 4 && media < 6){
      aproveitamento = "D";
    }else if(media >= 0 && media < 4){
      aproveitamento = "E";
    }

    System.out.println("Nota 1: " + nota1);
    System.out.println("Nota 2: " + nota2);
    System.out.println("Media: " + media);
    System.out.println("Conceito: " + aproveitamento);

    switch(aproveitamento){
      case "A" :
      case "B" :
      case "C" : System.out.println("APROVADO"); break;
      case "D" :
      case "E" : System.out.println("REPROVADO"); break;
    }

  }

}
