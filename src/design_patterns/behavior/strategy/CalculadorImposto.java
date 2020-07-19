package design_patterns.behavior.strategy;

import java.math.BigDecimal;

public class CalculadorImposto {

    public BigDecimal calcular(Orcamento orcamento, Imposto imposto){
        System.out.println("Calculo de " + imposto);
        return imposto.calcular(orcamento);
    }
}
