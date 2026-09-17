package pedro.atividade.exercicio01;

public class Gato extends Animal {
    public Gato(String nome) {
        super(nome);
    }
    @Override
    public void emitirSom() {
        System.out.println(this.nome + " faz Miau Miau");
    }
}