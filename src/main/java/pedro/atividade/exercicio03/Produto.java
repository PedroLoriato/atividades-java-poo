package pedro.atividade.exercicio03;

public class Produto {
    private String nome;
    private Double preco;

    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return this.nome;
    }

    public Double getPreco() {
        return this.preco;
    }

    @Override
    public String toString() {
        return "Produto [Nome: " + this.nome + " | Preço: R$ " + String.format("%.2f", this.preco) + "]";
    }
}