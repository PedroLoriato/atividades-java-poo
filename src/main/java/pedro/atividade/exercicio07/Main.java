package pedro.atividade.exercicio07;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static void exibeInformacoesPagamento(List<Pagavel> folhaPagamento) {
        folhaPagamento.forEach(pessoa -> {
            System.out.println("Valor processado: R$ " + String.format("%.2f", pessoa.calcularPagamento()));
        });
    }

    private static Double calculaTotalPagar(List<Pagavel> folhaPagamento) {
        Double totalPagar = 0.0;

        for (Pagavel pessoa : folhaPagamento) {
            totalPagar += pessoa.calcularPagamento();
        }
        return totalPagar;
    }

    public static void main(String[] args) {
        List<Pagavel> folhaPagamento = new ArrayList<>();

        folhaPagamento.add(new Funcionario("Ana", 4500.00));
        folhaPagamento.add(new Freelancer("Bruno", 60.00, 100));
        folhaPagamento.add(new Funcionario("Carlos", 3200.00));
        folhaPagamento.add(new Freelancer("Daniela", 85.00, 50));

        exibeInformacoesPagamento(folhaPagamento);
        System.out.println(
                "Total Geral a Pagar: R$ " + String.format("%.2f", calculaTotalPagar(folhaPagamento))
        );
    }
}