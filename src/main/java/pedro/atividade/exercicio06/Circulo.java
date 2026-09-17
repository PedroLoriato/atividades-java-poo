package pedro.atividade.exercicio06;

public class Circulo extends FormaGeometrica {
    private final Double raio;

    public Circulo(String nome, Double raio) {
        super(nome);
        this.raio = raio;
    }

    @Override
    public Double calcularArea() {
        return Math.PI * Math.pow(this.raio, 2);
    }
}