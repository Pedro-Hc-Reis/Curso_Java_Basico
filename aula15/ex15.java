package aula15;

import java.util.Scanner;

public class ex15 {
  
  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);

    System.out.println("Digite o tamanho do primeiro lado do triângulo: ");
    int lado1 = scan.nextInt();

    System.out.println("Digite o tamanho do segundo lado do triângulo: ");
    int lado2 = scan.nextInt();

    System.out.println("Digite o tamanho do terceiro lado do triângulo: ");
    int lado3 = scan.nextInt();

    if (((lado1 + lado2) > lado3) && ((lado3 + lado2) > lado1) && ((lado1 + lado2) > lado3)){

      if(lado1 == lado2 && lado1 == lado3 && lado2 == lado3){
        System.out.println("Triângulo Equilátero");
      } else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3){
        System.out.println("Triângulo Escaleno");
      } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
        System.out.println("Triângulo Isóceles");
      }

    } else {
      System.out.println("Não forma um triãngulo");
    }

  }

}
