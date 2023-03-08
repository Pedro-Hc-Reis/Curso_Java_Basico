package aula34;
public class TesteCalculadora {

    static int resultSoma;

    public static void main(String[] args){

        resultSoma = Calculadora.soma(1, 2);

        //Calculadora calc = new Calculadora();

        //calc.soma(1 , 2);
        //calc.soma(1.0 , 2.0);

        soma2Valores(1 ,2);

    }

    static int soma2Valores(int num1,int num2){
        return Calculadora.soma(num1, num2);
    }
}
