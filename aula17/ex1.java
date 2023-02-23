package aula17;

import java.util.Scanner;

public class ex1 {
  public  static void main (String[] args){

    Scanner scan = new Scanner(System.in);
    double nota;
    boolean notaValida = false;

    do {
      System.out.println("Informe sua nota, entre 0 e 10:");
      nota = scan.nextDouble();
      if(nota >= 0 && nota <= 10){
        System.out.println("Nota: " + nota);
        notaValida = true;
      } else{
        System.out.println("Nota inválida, nota: " + nota);
      }

    } while(!notaValida);
  }
}
