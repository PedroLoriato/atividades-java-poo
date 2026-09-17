package pedro.atividade.exercicio04;

public class Funcionario {
    protected String nome;
    protected Double salarioBase;

    public Funcionario(String nome, Double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public Double calcularSalario() {
        return this.salarioBase;
    }

    public String getNome() {
        return this.nome;
    }
}