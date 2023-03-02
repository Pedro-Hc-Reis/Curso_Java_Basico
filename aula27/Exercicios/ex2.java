package aula27.Exercicios;

public class ex2 {

    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();

        conta.numero = 12345;
        conta.saldo = 1000;
        conta.especial = true;
        conta.limiteEspecial = 500;



        System.out.println("Saldo inicial: R$" + conta.consultarSaldo());
        conta.depositar(500);
        conta.sacar(1600);
        System.out.println("Usando cheque especial? " + conta.usandoChequeEspecial());
    }
}
