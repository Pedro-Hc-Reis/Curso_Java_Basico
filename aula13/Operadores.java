package aula13;

public class Operadores {

  public static void main(String[] args){
    
    int resultado = 1 + 2;
    System.out.println(resultado);

    resultado = resultado - 1;
    System.out.println(resultado);

    resultado = resultado * 2;
    System.out.println(resultado);

    resultado = resultado / 2;
    System.out.println(resultado);

    resultado += 8;
    System.out.println(resultado);

    resultado = resultado % 7;
    System.out.println(resultado);

    resultado++;
    System.out.println(resultado);

    String primeiroNome = "Pedro";
    String segundoNome = " Reis";
    String nomeCompleto = primeiroNome + segundoNome;
    System.out.println(nomeCompleto);

  } 
}
