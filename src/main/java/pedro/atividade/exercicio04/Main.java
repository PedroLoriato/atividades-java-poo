package pedro.atividade.exercicio04;

public class Main {
    private static void exibeInformacoesFuncionario(Funcionario funcionario){
        System.out.println(
                "Funcionário: " + funcionario.getNome() +
                " | Salário: R$ " + funcionario.calcularSalario()
        );
    }

    private static void exibeInformacoesEstagiario(Estagiario estagiario){
        System.out.println(
                "Estagiário: " + estagiario.getNome() +
                " | Salário: R$ " + estagiario.calcularSalario()
        );
    }

    public static void main(String[] args) {
        exibeInformacoesFuncionario(new Funcionario("Gustavo", 4500.00));
        exibeInformacoesEstagiario(new Estagiario("Pedro", 1500.00, 300.00));
    }
}
