package aula27.Exercicios;

public class Lampada {
    boolean ligadaLampada = false;
    boolean desligadaLampada = false;

    void ligarLampada(){
        ligadaLampada = true;
        desligadaLampada = false;
    }

    void desligarLampada(){
        desligadaLampada = true;
        ligadaLampada = false;
    }

    void exibirLampada(){
        if(ligadaLampada == true && desligadaLampada == false){
            System.out.println("Lampada ligada");
        } else if (desligadaLampada == true && ligadaLampada == false) {
            System.out.println("Lampada desligada");
        }
    }
}
