package pedro.atividade.exercicio05;

public class Calculadora {
    public Integer somar(Integer a, Integer b) {
        return a + b;
    }

    /**
     * SOBRECARGA (Overload):
     * Mesmo nome (somar), mas com tipos de parâmetros diferentes (Double).
     */
    public Double somar(Double a, Double b) {
        return a + b;
    }

    /**
     * SOBRECARGA (Overload):
     * Mesmo nome (somar), mas com quantidade de parâmetros diferente (três Integers).
     */
    public Integer somar(Integer a, Integer b, Integer c) {
        return a + b + c;
    }
}
