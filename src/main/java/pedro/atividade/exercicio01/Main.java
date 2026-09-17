package pedro.atividade.exercicio01;

public class Main {
    private static void exibeInformacoesAnimal(Animal animal) {
        animal.emitirSom();
    }

    public static void main(String[] args) {
        System.out.println("--- Testando os Sons ---");
        exibeInformacoesAnimal(new Animal("Bicho"));
        exibeInformacoesAnimal(new Cachorro("Rex"));
        exibeInformacoesAnimal(new Gato("Mingau"));
    }
}