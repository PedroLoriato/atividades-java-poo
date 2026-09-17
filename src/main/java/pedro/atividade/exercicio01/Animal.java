package pedro.atividade.exercicio01;

public class Animal {
    protected String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public void emitirSom() {
        System.out.println(this.nome + " faz Muuu");
    }
}
