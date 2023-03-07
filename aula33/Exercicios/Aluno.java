package aula33.Exercicios;

public class Aluno {

    private String nome;
    private String matricula;
    private String curso;
    private String[] disciplinas;
    private double[][] notas;

    public Aluno() {
        disciplinas = new String[3];
        notas = new double[3][4];
    }

    public Aluno(String nome, String matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.disciplinas = new String[3];
        this.notas = new double[3][4];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String[] getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(String[] disciplinas) {
        this.disciplinas = disciplinas;
    }

    public double[][] getNotas() {
        return notas;
    }

    public void setNotas(double[][] notas) {
        this.notas = notas;
    }

    public void mostrarInfo(){
        System.out.println("Nome: " + getNome());
        System.out.println("Matrícula: " + getMatricula());
        System.out.println("Nome do curso: " + getCurso());

        for(int i = 0 ; i < notas.length ; i++){
            System.out.println("Notas da disciplina " + getDisciplinas()[i]);
            for(int j = 0 ; j < notas[i].length ; j++){
                System.out.print(notas[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean verficarAprovado(int indice){
        if(obterMedia(indice) >= 7){
            return  true;
        }
        return false;
    }

    private double obterMedia(int indice){
        double soma = 0;
        for(int i = 0 ; i < notas[indice].length ; i++){
            soma += notas[indice][i];
        }

        double media = soma / 4;
        return media;
    }

    public void setNomeDisciplinaPos(int pos, String disciplina){
        this.disciplinas[pos] = disciplina;
    }

    public void setNomePosIJ(int posI, int posJ, double nota){
        this.notas[posI][posJ] = nota;
    }
}
