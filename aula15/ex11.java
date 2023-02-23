package aula15;

import java.util.Scanner;

public class ex11 {
  
  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);

    System.out.println("Digite seu salário atual: ");
    double salarioAtual = scan.nextDouble();

    int percentual = 0;

    if(salarioAtual <= 280){
      percentual = 20;
    } else if(salarioAtual > 280 && salarioAtual < 700){
      percentual = 15;
    } else if (salarioAtual >= 700 && salarioAtual < 1500){
      percentual = 10;
    } else if (salarioAtual >= 1500){
      percentual = 5;
    }

    double aumento = (salarioAtual/100)*percentual;
    double novoSalario = salarioAtual + aumento;

    System.out.println("Seu salário atual é " + salarioAtual + ". Você tera um percentual de aumento de " + percentual + "%, e seu aumento será de " + aumento + " e ele passara a ser " + novoSalario);
    
  }

}
