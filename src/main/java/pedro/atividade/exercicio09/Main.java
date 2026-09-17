package pedro.atividade.exercicio09;

public class Main {
    private static void exibeFechamento(Double valor) {
        System.out.println("--- Fechamento de Lote ---");
        System.out.println("Valor Original do Lote: R$ " + String.format("%.2f", valor));
        System.out.println("----------------------------------------------\n");
    }

    private static void imprimeFechamento(String cenario, Pedido pedido) {
        System.out.println("Cenário: " + cenario);
        System.out.println("Valor a pagar: R$ " + String.format("%.2f", pedido.fecharPedido()));
        System.out.println();
    }

    public static void main(String[] args) {
        Double valorTotalSacas = 5000.00;

        exibeFechamento(valorTotalSacas);

        Pedido pedidoCafe = new Pedido(
                valorTotalSacas,
                new SemDesconto()
        );

        imprimeFechamento("Venda Padrão (Sem Desconto)", pedidoCafe);

        pedidoCafe.mudarEstrategia(new DescontoClienteVip());
        imprimeFechamento("Venda para Parceiro VIP (15% OFF)", pedidoCafe);

        pedidoCafe.mudarEstrategia(new DescontoBlackFriday());
        imprimeFechamento("Liquidação Black Friday (30% OFF)", pedidoCafe);
    }
}