package pedro.atividade.exercicio03;

public class Produto {
    private final String nome;
    private final Double preco;

    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto [Nome: " + this.nome + " | Preço: R$ " + String.format("%.2f", this.preco) + "]";
    }
}