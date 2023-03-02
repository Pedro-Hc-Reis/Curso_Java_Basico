package aula27.Exercicios;

public class ContaCorrente {

    int numero;
    double saldo;
    boolean especial;
    double limiteEspecial;


    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        System.out.println("Novo saldo: R$" + saldo);
    }

    public boolean sacar(double valor) {
        if (valor > saldo + limiteEspecial) {
            System.out.println("Saldo insuficiente.");
            return false;
        } else if(saldo >= valor){
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
            System.out.println("Novo saldo: R$" + saldo);
            return true;
        }else{
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
            System.out.println("Novo saldo: R$" + saldo);
            return true;
        }
    }

    public double consultarSaldo() {
        return saldo;
    }

    public boolean usandoChequeEspecial() {
        return saldo < 0 && especial;
    }
}
