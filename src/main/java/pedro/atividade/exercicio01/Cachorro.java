package pedro.atividade.exercicio01;

public class Cachorro extends Animal {
    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println(this.nome + " faz Au Au");
    }
}