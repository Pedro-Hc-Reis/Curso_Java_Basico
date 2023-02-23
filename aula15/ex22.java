package aula15;

import java.util.Scanner;

public class ex22 {

  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);

    System.out.println("Quantos kg de maça deseja comprar?");
    double kgMaca = scan.nextDouble();
    System.out.println("Quantos kg de morango deseja comprar?");
    double kgMorango = scan.nextDouble();

    double desconto = 0;
    double valorLiquido = 0;
    
    double precoMaca = 0;
    double precoMorango = 0;
    double valorBruto = 0;
    double kgTotal = 0;

    if(kgMaca <= 5){
      precoMaca = 1.80;
    } else if (kgMaca > 5){
      precoMaca = 1.50;
    }

    if(kgMorango <= 5){
      precoMorango = 2.50;
    } else if (kgMorango > 5){
      precoMorango = 2.20;
    }
    kgTotal = kgMaca + kgMorango;
    valorBruto = (kgMaca * precoMaca) + (kgMorango * precoMorango);
    
    if (valorBruto > 25.00 || kgTotal > 8){
      desconto = (valorBruto / 100) * 10;
      valorLiquido = valorBruto - desconto;
    } else{
      valorLiquido = valorBruto - desconto;
    }
    System.out.println("Valor bruto: " + valorBruto);
    System.out.println("Desconto: " + desconto);
    System.out.println("Valor líquido: " + valorLiquido);
  }
  
}