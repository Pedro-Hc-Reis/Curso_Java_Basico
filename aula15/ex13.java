package aula15;

import java.util.Scanner;

public class ex13 {

  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);

    System.out.println("Qual dia da semana é hoje: 1 - Domingo | 2 - Segunda | 3 - Terça | 4 - Quarta | 5 - Quinta | 6 - Sexta | 7 - Sabado ");
    String numero = scan.next();

    if(numero.length() > 1){

      System.out.println("Não é uma letra valida");
    } else{
      switch(numero){
        case "1" : System.out.println("Hoje é Domingo"); break;
        case "2" : System.out.println("Hoje é Segunda"); break;
        case "3" : System.out.println("Hoje é Terça"); break;
        case "4" : System.out.println("Hoje é Quarta"); break;
        case "5" : System.out.println("Hoje é Quinta"); break;
        case "6" : System.out.println("Hoje é Sexta"); break;
        case "7" : System.out.println("Hoje é Domingo"); break;
        default : System.out.println("Valor inválido");
      }
    }
  }
  
}
