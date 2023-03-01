package aula17;

public class ex4 {
  public  static void main (String[] args){

    int ano = 0;
    double habitantesA = 80000;
    double habitantesB = 200000;

    while(habitantesA < habitantesB){
      habitantesA += (habitantesA / 100) * 3;
      habitantesB += (habitantesB / 100) * 1.5;
      
      ano++;
    }

    System.out.println("Os habitantes do país A (" + habitantesA + ") é maior que a populção do pais B (" + habitantesB + ") e foram precisos " + ano + " anos.");

  }
}
