package pedro.atividade.exercicio09;

public class SemDesconto implements CalculadoraDesconto {
    @Override
    public Double aplicarDesconto(Double valor) {
        return valor;
    }
}