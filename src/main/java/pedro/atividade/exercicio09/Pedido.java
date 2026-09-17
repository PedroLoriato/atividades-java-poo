package pedro.atividade.exercicio09;

public class Pedido {
    private final String descricao;
    private final Double valorOriginal;

    private CalculadoraDesconto estrategiaDesconto;

    public Pedido(String descricao, Double valorOriginal, CalculadoraDesconto estrategiaInicial) {
        this.descricao = descricao;
        this.valorOriginal = valorOriginal;
        this.estrategiaDesconto = estrategiaInicial;
    }

    public void mudarEstrategia(CalculadoraDesconto novaEstrategia) {
        this.estrategiaDesconto = novaEstrategia;
    }

    public Double fecharPedido() {
        return this.estrategiaDesconto.aplicarDesconto(this.valorOriginal);
    }

    public String getDescricao() {
        return this.descricao;
    }

    public Double getValorOriginal() {
        return this.valorOriginal;
    }
}