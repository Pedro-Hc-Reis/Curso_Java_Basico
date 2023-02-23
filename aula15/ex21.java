package aula15;

import java.util.Scanner;

public class ex21 {
  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);

    System.out.println("Qual combustivel deseja abastecer? A - Álcool | G - Gasolina");
    String combustivel = scan.next();

    System.out.println("Quantos litros deseja abastecer?");
    Double litros = scan.nextDouble();

    double valorBruto = 0;
    boolean valida = true;
    double desconto = 0;
    double valorLiquido = 0;

    switch(combustivel){
      case "a" : valorBruto = litros * 1.90; break;
      case "b" : valorBruto = litros * 2.50; break;
      default : 
        System.out.println("Erro");
        valida = false;
    }

    if (valida){
      if(combustivel.equalsIgnoreCase("a") && litros <= 20){
        desconto = ((valorBruto / 100) * 3);
        valorLiquido = valorBruto - desconto;
        System.out.println("Valor a ser pago: " + valorLiquido + ", por " + litros + "L");
      } else if (combustivel.equalsIgnoreCase("a") && litros > 20){
        desconto = ((valorBruto / 100) * 5);
        valorLiquido = valorBruto - desconto;
        System.out.println("Valor a ser pago: " + valorLiquido + ", por " + litros + "L");
      } else if (combustivel.equalsIgnoreCase("g") && litros <= 20){
        desconto = ((valorBruto / 100) * 4);
        valorLiquido = valorBruto - desconto;
        System.out.println("Valor a ser pago: " + valorLiquido + ", por " + litros + "L");
      }else if (combustivel.equalsIgnoreCase("g") && litros > 20){
        desconto = ((valorBruto / 100) * 6);
        valorLiquido = valorBruto - desconto;
        System.out.println("Valor a ser pago: " + valorLiquido + ", por " + litros + "L");
      }
    }
  }
}
