package pedro.atividade.exercicio06;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static void exibeInformacoesFormas(List<FormaGeometrica> formas) {
        formas.forEach(FormaGeometrica::imprimirResumo);
    }

    private static Double calculaAreaTotal(List<FormaGeometrica> formas) {
        Double areaTotal = 0.0;
        for (FormaGeometrica forma : formas) {
            areaTotal += forma.calcularArea();
        }
        return areaTotal;
    }

    public static void main(String[] args) {
        List<FormaGeometrica> formas = new ArrayList<>();

        formas.add(new Circulo("Círculo Perfeito", 3.0));
        formas.add(new Quadrado("Quadrado Perfeito", 4.0));
        formas.add(new Retangulo("Campo de Futebol", 100.0, 70.0));

        exibeInformacoesFormas(formas);
        System.out.println(
                "Área Total de todas as formas: " + String.format("%.2f", calculaAreaTotal(formas))
        );
    }
}