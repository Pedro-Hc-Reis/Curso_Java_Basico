package aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {
  
  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);

    /*
    System.out.println("Digite seu nome: ");
    String nome = scan.nextLine();
    System.out.println("Seu nome é " + nome);

    System.out.println("Digite seu nome: ");
    String primeiroNome = scan.next();
    System.out.println("Seu primeiro nome é " + primeiroNome);

    System.out.println("Digite sua idade: ");
    int idade = scan.nextInt();
    System.out.println("Sua idade é: " + idade);

    System.out.println("Digite sua idade: ");
    double altura = scan.nextDouble();
    System.out.println("Sua altura é: " + altura);
    */

    System.out.println("Digite seu primeiro nome, idade, altura, quantidade de filhos e se tem Pet: ");
    String primeiroNome = scan.next();
    int idade = scan.nextInt();
    float altura = scan.nextFloat();
    byte qtdFilhos = scan.nextByte();
    boolean temPet = scan.nextBoolean();

    System.out.println("Você digitou os seguntes valores: ");
    System.out.println("Primeiro nome: " + primeiroNome);
    System.out.println("Idade: " + idade);
    System.out.println("Atura: " + altura);
    System.out.println("Quantidade de filhos: " + qtdFilhos);
    System.out.println("Tem Pet? " + temPet);

  }
}