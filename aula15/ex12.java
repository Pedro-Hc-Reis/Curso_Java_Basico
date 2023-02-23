package aula15;

import java.util.Scanner;

public class ex12 {

  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);

    System.out.println("Digite o valor de sua hora trabalhada: ");
    double valorHora = scan.nextDouble();

    System.out.println("Digite quantas horas foram trabalhadas esse mês: ");
    int horas = scan.nextInt();

    Double salarioBruto = valorHora * horas;
    int percentual = 0;

    if (salarioBruto <= 900){
      percentual = 0;
    } else if(salarioBruto > 900 && salarioBruto <= 1500){
      percentual = 5;
    } else if(salarioBruto > 1500 && salarioBruto <= 2500){
      percentual = 10;
    } else if(salarioBruto > 2500){
      percentual = 20;
    }

    double fgts = (salarioBruto / 100) * 11;

    double inss = (salarioBruto / 100) * 10;

    double ir = (salarioBruto / 100) * percentual;

    double totalDesconto = inss + ir;
    double salarioLiquido = salarioBruto - totalDesconto;

    System.out.println("Salario Bruto: " + salarioBruto);
    System.out.println("Ir: " + ir);
    System.out.println("Inss " + inss);
    System.out.println("FGTS: " + fgts);
    System.out.println("Total de Descontos: " + totalDesconto);
    System.out.println("Sálario liquidp: " + salarioLiquido);
    
  }
  
}
