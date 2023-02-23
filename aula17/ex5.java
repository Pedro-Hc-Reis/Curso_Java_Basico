package aula17;

import java.util.Scanner;

public class ex5 {
  public  static void main (String[] args){

    Scanner scan = new Scanner(System.in);
    int ano = 0;
    double habitantesA;
    double habitantesB;
    double taxaA;
    double taxaB;
    boolean valido = false;

    do{
      System.out.println("Entre com a populçao A:");
      habitantesA = scan.nextDouble();

      if (habitantesA > 0 ){
        valido = true;
      }else{
        System.out.println("Erro");
      }
    }while(!valido);

    valido = false;
    do{
      System.out.println("Entre com a populçao B:");
      habitantesB = scan.nextDouble();

      if (habitantesB > 0 ){
        valido = true;
      }else{
        System.out.println("Erro");
      }
    }while(!valido);

    valido = false;
    do{
      System.out.println("Entre com a taxa da população A:");
      taxaA = scan.nextDouble();

      if (taxaA > 0 ){
        valido = true;
      }else{
        System.out.println("Erro");
      }
    }while(!valido);

    valido = false;
    do{
      System.out.println("Entre com a taxa da população B:");
      taxaB = scan.nextDouble();

      if (taxaB > 0 ){
        valido = true;
      }else{
        System.out.println("Erro");
      }
    }while(!valido);

    while(habitantesA < habitantesB){
      habitantesA += (habitantesA / 100) * taxaA;
      habitantesB += (habitantesB / 100) * taxaB;
      
      ano++;
    }

    System.out.println("Os habitantes do país A (" + habitantesA + ") é maior que a populção do pais B (" + habitantesB + ") e foram precisos " + ano + " anos.");

  }
}
