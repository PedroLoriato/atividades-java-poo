package pedro.atividade.exercicio04;

public class Estagiario extends Funcionario {
    private final Double auxilioTransporte;

    public Estagiario(String nome, Double salarioBase, Double auxilioTransporte) {
        super(nome, salarioBase);
        this.auxilioTransporte = auxilioTransporte;
    }

    @Override
    public Double calcularSalario() {
        return super.calcularSalario() + this.auxilioTransporte;
    }
}