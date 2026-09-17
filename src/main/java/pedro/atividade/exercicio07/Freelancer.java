package pedro.atividade.exercicio07;

public class Freelancer implements Pagavel {
    private final String nome;
    private final Double valorHora;
    private final Integer horasTrabalhadas;

    public Freelancer(String nome, Double valorHora, Integer horasTrabalhadas) {
        this.nome = nome;
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public Double calcularPagamento() {
        return this.valorHora * this.horasTrabalhadas;
    }

    public String getNome() {
        return nome;
    }
}