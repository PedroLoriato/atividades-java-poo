package pedro.atividade.exercicio06;

public class Quadrado extends FormaGeometrica {
    private final Double lado;

    public Quadrado(String nome, Double lado) {
        super(nome);
        this.lado = lado;
    }

    @Override
    public Double calcularArea() {
        return this.lado * this.lado;
    }
}
