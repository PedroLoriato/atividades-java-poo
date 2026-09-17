package pedro.atividade.exercicio02;

public class Main {
    private static void exibeInformacoesPessoa(Pessoa pessoa) {
        System.out.println(
                "Oi eu sou " + pessoa.getNome() + " e tenho " + pessoa.getIdade() + " anos"
        );
    }

    private static void exibeInformacoesAluno(Aluno aluno) {
        System.out.println(
                "Oi eu sou " + aluno.getNome() + ", tenho " + aluno.getIdade()
                + " anos e minha matrícula é " + aluno.getMatricula()
        );
    }

    public static void main(String[] args) {
        exibeInformacoesPessoa(new Pessoa("Pedro", 21));
        exibeInformacoesAluno(new Aluno("João", 22, "20231tsi0193"));
    }
}
