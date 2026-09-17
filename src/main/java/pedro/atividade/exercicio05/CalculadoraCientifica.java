package pedro.atividade.exercicio05;

public class CalculadoraCientifica extends Calculadora {
    /**
     * SOBRESCRITA (Override):
     * Substitui o comportamento do método herdado da classe pai.
     * A assinatura (nome e parâmetros: Integer a, Integer b) é igual.
     * A anotação @Override garante a sobrescrita.
     */
    @Override
    public Integer somar(Integer a, Integer b) {
        System.out.println("[Modo Científico] Executando soma de inteiros...");
        return a + b;
    }
}