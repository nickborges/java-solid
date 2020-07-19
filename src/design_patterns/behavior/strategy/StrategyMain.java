package design_patterns.behavior.strategy;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class StrategyMain {

    public static void main(String[] args) {

        BigDecimal valor = BigDecimal.valueOf(500);
        Orcamento orcamento = new Orcamento(valor);

        CalculadorImposto calculadorImposto = new CalculadorImposto();
        calculadorImposto.calcular(orcamento, new ICMS());
        calculadorImposto.calcular(orcamento, new ISS());

        // >>> ou usar lambda <<<
        BigDecimal icms = BigDecimal.valueOf(0.3);
        BigDecimal iss = BigDecimal.valueOf(0.2);
        BigDecimal iof = BigDecimal.valueOf(0.1);

        List<Imposto> imposto = Arrays.asList(
                q -> q.getValor().multiply(icms),
                q -> q.getValor().multiply(iss),
                q -> q.getValor().multiply(iof)
        );

        imposto.forEach(f -> System.out.println(f.calcular(orcamento)));

    }
}
