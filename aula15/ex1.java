package aula15;

import java.util.Scanner;

public class ex1 {

  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);

    System.out.println("Digite o primeiro número: ");
    int primeiroNumero = scan.nextInt();

    System.out.println("Digite o segundo número: ");
    int segundoNumero = scan.nextInt();
    
    if(primeiroNumero > segundoNumero){
      System.out.println("O mair número foi: " + primeiroNumero);
    } else if(segundoNumero > primeiroNumero){
      System.out.println("O mair número foi: " + segundoNumero);
    } else{
      System.out.println("Os numeros são iguais");
    }
  }
  
}
