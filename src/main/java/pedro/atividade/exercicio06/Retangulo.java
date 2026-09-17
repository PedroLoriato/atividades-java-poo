package pedro.atividade.exercicio06;

public class Retangulo extends FormaGeometrica {
    private final Double base;
    private final Double altura;

    public Retangulo(String nome, Double base, Double altura) {
        super(nome);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public Double calcularArea() {
        return this.base * this.altura;
    }
}