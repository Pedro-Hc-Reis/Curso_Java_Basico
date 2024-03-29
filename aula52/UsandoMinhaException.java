package aula52;

public class UsandoMinhaException {

    public static void main(String[] args){

        try {
            teste();
        } catch (DivisaoNãoExata e) {
            e.printStackTrace();
        }
    }

    public static void teste() throws DivisaoNãoExata{
        int[] numeros = {4, 8, 5, 16, 32, 21, 64, 128};
        int[] demon = {2, 0, 4, 8, 0, 2, 4};

        for(int i = 0 ; i < numeros.length ; i++){

            try {
                if(numeros[i] % 2 != 0){
                    throw  new DivisaoNãoExata(numeros[i], demon[i]);
                }
                System.out.println(numeros[i] + "/" + demon[i] + " = " + (numeros[i] / demon[i]));
            }
            catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
                System.out.println("Ocorreu um erro");
                e.printStackTrace();
            }
        }
    }

}
