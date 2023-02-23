package aula15;

import java.util.Scanner;

public class ex19 {

  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);

    System.out.println("Entre com o primeiro número");
    int num1 = scan.nextInt();

    System.out.println("Entre com o segundo número");
    int num2 = scan.nextInt();

    System.out.println("Qual operação deseja fazer: 1 - + | 2 - - | 3 - * | 4 - /");
    int escolha = scan.nextInt();

    double resultado = 0;
    boolean valida = true;
    
    switch(escolha){
      case 1 : resultado = num1 + num2; break;
      case 2 : resultado = num1 - num2; break;
      case 3 : resultado = num1 * num2; break;
      case 4 : resultado = num1 / num2; break;
      default : 
        System.out.println("erro");
        valida = false;
    }

    if(valida){

      System.out.println("O resultado foi: " + resultado);

      System.out.println("=================================");

      if(resultado % 2 == 0){
        System.out.println("O número " + resultado + " par");
      } else {
        System.out.println("O número " + resultado + " ímpar");
      }
      
      if(resultado >= 0){
        System.out.println("O número " + resultado + " é positivo.");
      }else{
        System.out.println("O número " + resultado + " é negativo.");
      }
    }
  }
  
}
