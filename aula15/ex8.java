package aula15;

import java.util.Scanner;

public class ex8 {
  
  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);

    System.out.println("Digite o valor do primeiro produto:");
    double num1 = scan.nextDouble();

    System.out.println("Digite o valor do segundo produto:");
    double num2 = scan.nextDouble();

    System.out.println("Digite o valor do terceiro produto:");
    double num3 = scan.nextDouble();

    if(num1 <= num2 && num1 <= num3){
      System.out.println("O primeiro é mais barato, valor: " + num1);
    } else if (num2 <= num1 && num2 <= num3){
      System.out.println("O segundo é mais barato, valor:" + num2);
    } else if (num3 <= num1 && num3 <= num2){
      System.out.println("O terceiro é mais barato, valor:" + num3);
    }
  }
}
