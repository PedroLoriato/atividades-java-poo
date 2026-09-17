package pedro.atividade.exercicio09;

public class DescontoBlackFriday implements CalculadoraDesconto {
    @Override
    public Double aplicarDesconto(Double valor) {
        return valor * 0.70;
    }
}