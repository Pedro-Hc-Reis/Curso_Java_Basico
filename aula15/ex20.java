package aula15;

import java.util.Scanner;

public class ex20 {

  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);

    System.out.println("Telefenou para a vítima?  sim ou nao?");
    String resposta1 = scan.next();

    System.out.println("Esteve no local do crime?  sim ou nao?");
    String resposta2 = scan.next();

    System.out.println("Mora perto da vítima?  sim ou nao?");
    String resposta3 = scan.next();

    System.out.println("Devia para a vítima?  sim ou nao?");
    String resposta4 = scan.next();

    System.out.println("Já trabalhou com a vítima?  sim ou nao?");
    String resposta5 = scan.next();

    int classificacao = 0;

    if(resposta1.length() == 3){
      if(resposta1.equalsIgnoreCase("sim")){
        classificacao ++;
      }
    } else{
      System.out.println("Não é uma resposta válida");
    }

    if(resposta2.length() == 3){
      if(resposta2.equalsIgnoreCase("sim")){
        classificacao ++;
      }
    } else{
      System.out.println("Não é uma resposta válida");
    }

    if(resposta3.length() == 3){
      if(resposta3.equalsIgnoreCase("sim")){
        classificacao ++;
      }
    } else{
      System.out.println("Não é uma resposta válida");
    }

    if(resposta4.length() == 3){
      if(resposta4.equalsIgnoreCase("sim")){
        classificacao ++;
      }
    } else{
      System.out.println("Não é uma resposta válida");
    }

    if(resposta5.length() == 3){
      if(resposta5.equalsIgnoreCase("sim")){
        classificacao ++;
      }
    } else{
      System.out.println("Não é uma resposta válida");
    }

    if(classificacao == 2){
      System.out.println("SUSPEITA");
    } else if (classificacao == 3 || classificacao == 4){
      System.out.println("Cúmplice");
    } else if (classificacao == 5){
      System.out.println("Assasino");
    } else if(classificacao == 0){
      System.out.println("Inocente");
    }

  }
}
