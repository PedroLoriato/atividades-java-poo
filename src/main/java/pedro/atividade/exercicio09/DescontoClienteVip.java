package pedro.atividade.exercicio09;

public class DescontoClienteVip implements CalculadoraDesconto {
    @Override
    public Double aplicarDesconto(Double valor) {
        return valor * 0.85;
    }
}
