package pedro.atividade.exercicio06;

public abstract class FormaGeometrica {
    protected String nome;

    public FormaGeometrica(String nome) {
        this.nome = nome;
    }

    public abstract Double calcularArea();

    public void imprimirResumo() {
        System.out.println("Forma: " + this.nome + " | Área: " + String.format("%.2f", calcularArea()));
    }
}