package aula31;

public class Carro {

    public String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    private double consumoCombustivel;

    public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
        super();
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.capCombustivel = capCombustivel;
        this.consumoCombustivel = consumoCombustivel;
    }

    public Carro() { }

    public Carro(String marca, String modelo, int numPassageiros) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        System.out.println("Chamando o construtor com 3 parãmetros");
    }

    public Carro(String marca, String modelo) {
        this(marca, modelo, 10);
        System.out.println("Chamando o construtor com 2 parãmetros");
    }

    public void exibirAutonomia(){
        System.out.println("A autonomia do carro é: " + this.capCombustivel * this.consumoCombustivel + " km");
    }

    public double obterAutonomia(){
        System.out.println("Método obterAutonomia foi chamado.");

        return this.capCombustivel * this.consumoCombustivel;
    }

    private double divideKMPorConsumoCombustivel(double km){
        return km / this.consumoCombustivel;
    }

    public double calcularCombustivel(double km){
        return this.divideKMPorConsumoCombustivel(km);
    }
}
