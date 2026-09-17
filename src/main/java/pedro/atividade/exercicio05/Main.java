package pedro.atividade.exercicio05;

public class Main {

    private static void exibeSomasCalculadora(Calculadora calculadora) {
        System.out.println("--- Testando a Calculadora Comum ---");
        System.out.println("Soma 2 inteiros: " + calculadora.somar(5, 5));
        System.out.println("Soma 2 doubles: " + calculadora.somar(5.5, 2.5));
        System.out.println("Soma 3 inteiros: " + calculadora.somar(1, 2, 3));
    }

    private static void exibeSomasCalcCientifica(CalculadoraCientifica calcCientifica) {
        System.out.println("\n--- Testando a Calculadora Científica ---");
        System.out.println("Soma 2 inteiros: " + calcCientifica.somar(5, 5));
        System.out.println("Soma 2 doubles: " + calcCientifica.somar(5.5, 2.5));
        System.out.println("Soma 3 inteiros: " + calcCientifica.somar(3, 2, 5));
    }

    public static void main(String[] args) {
        exibeSomasCalculadora(new Calculadora());
        exibeSomasCalcCientifica(new CalculadoraCientifica());
    }
}