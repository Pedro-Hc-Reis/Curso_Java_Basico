package aula44;

public class Gato extends Mamifero implements AnimalDomesticado, AnimalEstimacao {

    private String raca;

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raça) {
        this.raca = raça;
    }

    @Override
    public void amamentar() {  }

    @Override
    public void emitirSom() {  }

    @Override
    public void brincar() { }

    @Override
    public void levarPassear() {  }

    @Override
    public void levarVeterinario() {  }

    @Override
    public void alimentar() {  }
}