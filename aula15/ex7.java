package aula15;

import java.util.Scanner;

public class ex7 {

  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);

    System.out.println("Digite o primeiro numero:");
    int num1 = scan.nextInt();

    System.out.println("Digite o segundo numero:");
    int num2 = scan.nextInt();

    System.out.println("Digite o terceiro numero:");
    int num3 = scan.nextInt();

    if(num1 >= num2 && num1 >= num3){
      System.out.println("Num1 é maior: " + num1);
    } else if (num2 >= num1 && num2 >= num3){
      System.out.println("Num2 é maior" + num2);
    } else if (num3 >= num1 && num3 >= num2){
      System.out.println("Num3 é maior" + num3);
    }

    if(num1 <= num2 && num1 <= num3){
      System.out.println("Num1 é menor: " + num1);
    } else if (num2 <= num1 && num2 <= num3){
      System.out.println("Num2 é menor" + num2);
    } else if (num3 <= num1 && num3 <= num2){
      System.out.println("Num3 é menor" + num3);
    }
  }
  
}
