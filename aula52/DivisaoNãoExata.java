package aula52;

public class DivisaoNãoExata extends Exception{

    private int num;
    private int dem;

    public DivisaoNãoExata(int num, int dem){

        this.num = num;
        this.dem = dem;
    }

    @Override
    public String toString() {
        return "Resultado de " + num + "/" + dem + " não é um inteiro!";
    }
}
