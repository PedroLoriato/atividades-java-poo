package pedro.atividade.exercicio02;

public class Pessoa {
    protected String nome;
    protected Integer idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return this.nome;
    }

    public Integer getIdade() {
        return this.idade;
    }
}
