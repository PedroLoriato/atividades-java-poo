package pedro.atividade.exercicio07;

public class Funcionario implements Pagavel {
    private final String nome;
    private final Double salarioFixo;

    public Funcionario(String nome, Double salarioFixo) {
        this.nome = nome;
        this.salarioFixo = salarioFixo;
    }

    @Override
    public Double calcularPagamento() {
        return this.salarioFixo;
    }

    public String getNome() {
        return nome;
    }
}