package aula17;

import java.util.Scanner;

public class ex3 {
  public  static void main (String[] args){

    Scanner scan = new Scanner(System.in);
    String nome;
    boolean nomeValido = false;

    do {
      System.out.println("Informe seu nome, com mais de 3 caracteres:");
      nome = scan.next();
      if(nome.length() > 3){
        System.out.println("Nome: " + nome);
        nomeValido = true;
      } else{
        System.out.println("Nome inválido, nome: " + nome);
      }
    } while(!nomeValido);

    int idade;
    boolean idadeValida = false;

    do {
      System.out.println("Informe sua idade, entre 0 e 150:");
      idade = scan.nextInt();
      if(idade >= 0 && idade <= 150){
        System.out.println("Idade: " + idade);
        idadeValida = true;
      } else{
        System.out.println("Idade inválida, idade: " + idade);
      }
    } while(!idadeValida);

    double salario;
    boolean salarioValido = false;

    do {
      System.out.println("Informe seu salario, maoir que 0:");
      salario = scan.nextDouble();
      if(salario > 0){
        System.out.println("Salario: " + salario);
        salarioValido = true;
      } else{
        System.out.println("Salario inválida, salario: " + salario);
      }
    } while(!salarioValido);

    String sexo;
    boolean sexoValido = false;

    do {
      System.out.println("Informe seu sexo, M - Masculino | F - Feminino:");
      sexo = scan.next();
      if(sexo.equalsIgnoreCase("f")){
        sexo = "Feminino";
        System.out.println("Sexo: " + sexo);
        sexoValido = true;
      } else if(sexo.equalsIgnoreCase("m")){
        sexo = "Masculino";
        System.out.println("Sexo: " + sexo);
        sexoValido = true;
      }else{
        System.out.println("Sexo inválida, foi digitado: " + sexo);
      }
    } while(!sexoValido);


    String status;
    boolean statusValido = false;

    do {
      System.out.println("Informe seu estado civil, S - Solteiro | C - Casado | V - Viuvo | D - Divorciado:");
      status = scan.next();
      if(status.equalsIgnoreCase("s")){
        status = "Solteiro";
        System.out.println("Estado Civil: " + status);
        statusValido = true;
      } else if(status.equalsIgnoreCase("c")){
        status = "Casado";
        System.out.println("Estado Civil: " + status);
        statusValido = true;
      }else if(status.equalsIgnoreCase("v")){
        status = "Viuvo";
        System.out.println("Estado Civil: " + status);
        statusValido = true;
      }else if(status.equalsIgnoreCase("d")){
        status = "Divorciado";
        System.out.println("Estado Civil: " + status);
        statusValido = true;
      }else{
        System.out.println("Sexo inválida, foi digitado: " + status);
      }
    } while(!statusValido);

    System.out.println("=================================================");

    System.out.println("Nome: " + nome);
    System.out.println("Idade: " + idade);
    System.out.println("Salario: " + salario);
    System.out.println("Sexo: " + sexo);
    System.out.println("Estado Civil: " + status);

  }
}
