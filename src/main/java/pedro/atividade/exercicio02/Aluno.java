package pedro.atividade.exercicio02;

public class Aluno extends Pessoa {
    protected String matricula;

    public Aluno(String nome, Integer idade, String matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return this.matricula;
    }
}
