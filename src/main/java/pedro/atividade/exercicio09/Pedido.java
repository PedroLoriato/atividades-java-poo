package pedro.atividade.exercicio09;

public class Pedido {
    private final Double valorOriginal;
    private CalculadoraDesconto estrategiaDesconto;

    public Pedido(Double valorOriginal, CalculadoraDesconto estrategiaInicial) {
        this.valorOriginal = valorOriginal;
        this.estrategiaDesconto = estrategiaInicial;
    }

    public void mudarEstrategia(CalculadoraDesconto novaEstrategia) {
        this.estrategiaDesconto = novaEstrategia;
    }

    public Double fecharPedido() {
        return this.estrategiaDesconto.aplicarDesconto(this.valorOriginal);
    }
}